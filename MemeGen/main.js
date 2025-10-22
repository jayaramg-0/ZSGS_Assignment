
  // Simple Meme Caption Lab - plain JS
  const imgfile = document.getElementById('imgfile');
  const topText = document.getElementById('topText');
  const botText = document.getElementById('botText');
  const fontSize = document.getElementById('fontSize');
  const fontFamily = document.getElementById('fontFamily');
  const textColor = document.getElementById('textColor');
  const stroke = document.getElementById('stroke');
  const renderBtn = document.getElementById('render');
  const downloadBtn = document.getElementById('download');
  const sample = document.getElementById('sample');

  const canvas = document.getElementById('memeCanvas');
  const ctx = canvas.getContext('2d');

  let image = new Image();
  let imgLoaded = false;

  // preview color sample
  textColor.addEventListener('input', () => sample.style.background = textColor.value);

  // load file
  imgfile.addEventListener('change', (e) => {
    const file = e.target.files[0];
    if (!file) return;
    const url = URL.createObjectURL(file);
    image = new Image();
    image.onload = () => {
      imgLoaded = true;
      // adjust canvas size to image but limit to max width for layout
      const maxWidth = 1000;
      const w = image.width;
      const h = image.height;
      const scale = Math.min(1, maxWidth / w); // scale down if huge
      canvas.width = Math.round(w * scale);
      canvas.height = Math.round(h * scale);
      drawMeme();
      URL.revokeObjectURL(url);
    };
    image.src = url;
  });

  // draw function
  function drawMeme() {
    // clear
    ctx.clearRect(0,0,canvas.width,canvas.height);

    // background if no image
    if (!imgLoaded) {
      ctx.fillStyle = '#222';
      ctx.fillRect(0,0,canvas.width,canvas.height);
      ctx.fillStyle = '#7f8c97';
      ctx.font = '18px sans-serif';
      ctx.textAlign = 'center';
      ctx.fillText('Upload an image to start', canvas.width/2, canvas.height/2);
      return;
    }

    // draw image (fit)
    ctx.drawImage(image, 0, 0, canvas.width, canvas.height);

    // text settings
    const size = parseInt(fontSize.value, 10) || 48;
    const family = fontFamily.value;
    ctx.textAlign = 'center';
    ctx.lineJoin = 'round';
    ctx.lineWidth = parseFloat(stroke.value) || 3;

    // top text
    drawText(topText.value.toUpperCase(), canvas.width/2, size + 8, size, family, textColor.value);

    // bottom text (slightly above bottom)
    drawText(botText.value.toUpperCase(), canvas.width/2, canvas.height - 8, size, family, textColor.value, true);
  }

  // helper: draw text with stroke for readability and wrap long lines
  function drawText(text, x, y, size, family, color, bottom=false) {
    if (!text) return;
    ctx.fillStyle = color;
    ctx.font = `${size}px ${family}`;
    ctx.strokeStyle = 'black';
    ctx.lineWidth = Math.max(1, parseFloat(stroke.value));

    // basic wrapping: split words and build lines that fit canvas
    const maxWidth = canvas.width - 20;
    const words = text.split(' ');
    const lines = [];
    let line = '';
    for (let w of words) {
      const test = line ? line + ' ' + w : w;
      const metrics = ctx.measureText(test);
      if (metrics.width > maxWidth && line) {
        lines.push(line);
        line = w;
      } else {
        line = test;
      }
    }
    if (line) lines.push(line);

    // draw multiple lines. if bottom==true, draw upwards
    const lineHeight = size * 1.05;
    if (!bottom) {
      for (let i = 0; i < lines.length; i++) {
        const ly = y + i * lineHeight;
        ctx.strokeText(lines[i], x, ly);
        ctx.fillText(lines[i], x, ly);
      }
    } else {
      for (let i = 0; i < lines.length; i++) {
        const ly = y - (lines.length - 1 - i) * lineHeight;
        ctx.strokeText(lines[i], x, ly);
        ctx.fillText(lines[i], x, ly);
      }
    }
  }

  // render button
  renderBtn.addEventListener('click', drawMeme);

  // live render while typing (optional)
  [topText, botText, fontSize, fontFamily, textColor, stroke].forEach(el => {
    el.addEventListener('input', drawMeme);
  });

  // download
  downloadBtn.addEventListener('click', () => {
    // ensure something drawn
    drawMeme();
    const link = document.createElement('a');
    link.download = 'meme.png';
    link.href = canvas.toDataURL('image/png');
    link.click();
  });

  // initial draw
  // set a default canvas size
  canvas.width = 640;
  canvas.height = 360;
  drawMeme();