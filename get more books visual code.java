import controlP5.*;

ControlP5 sk;
Button talk;
Button next;
Button leave;
Button left;
Button Back;
Button home;
Button library;
Button book1;
Button book2;
Button finish;

PImage img;

int bookOne = 0;
int bookTwo = 0;

void setup() {

  sk = new ControlP5(this);

  img = loadImage("https://media.gettyimages.com/id/175440771/photo/handsome-young-man-gesturing-thumbs-up-isolated.jpg?s=612x612&w=gi&k=20&c=rNDrj73bXAla605kVUdLvr2OkDNYhx8ITsk585iaeyI=");

  talk = sk.addButton("talk")
    .setPosition(260, 200)
    .setSize(50, 40);

  size(700, 700);
  background(230, 235, 190);
  fill(150, 75, 0);
  rect(1, 600, 697, 697);
  fill(130, 80, 80);
  rect(400, 50, 250, 570);
  fill(150, 75, 75);
  rect(410, 60, 230, 550);
  strokeWeight(1);
  line(640, 150, 410, 150);
  line(640, 140, 410, 140);
  line(640, 240, 410, 240);
  line(640, 250, 410, 250);
  line(640, 340, 410, 340);
  line(640, 350, 410, 350);
  line(640, 440, 410, 440);
  line(640, 450, 410, 450);
  line(640, 540, 410, 540);
  line(640, 550, 410, 550);
  fill(10, 10, 10);
  rect(60, 90, 320, 320);
  fill(0, 255, 255);
  rect(70, 100, 300, 300);
  line(220, 240, 220, 90);
  line(380, 260, 60, 260);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  rect(130, 150, 100, 100);
  line(200, 225, 160, 225);
  line(240, 690, 240, 500);
  line(120, 690, 120, 500);
  line(40, 300, 100, 300);
  line(260, 300, 325, 300);
  line(40, 300, 40, 450);
  line(325, 300, 325, 450);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  ellipse(150, 170, 10, 10);
  ellipse(200, 180, 10, 10);
}

void draw() {
}

void talk() {
  talk.remove();
  background(230, 235, 190);
  fill(150, 75, 0);
  rect(1, 600, 697, 697);
  fill(130, 80, 80);
  rect(400, 50, 250, 570);
  fill(150, 75, 75);
  rect(410, 60, 230, 550);
  strokeWeight(1);
  line(640, 150, 410, 150);
  line(640, 140, 410, 140);
  line(640, 240, 410, 240);
  line(640, 250, 410, 250);
  line(640, 340, 410, 340);
  line(640, 350, 410, 350);
  line(640, 440, 410, 440);
  line(640, 450, 410, 450);
  line(640, 540, 410, 540);
  line(640, 550, 410, 550);
  fill(10, 10, 10);
  rect(60, 90, 320, 320);
  fill(0, 255, 255);
  rect(70, 100, 300, 300);
  line(220, 240, 220, 90);
  line(380, 260, 60, 260);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  rect(130, 150, 100, 100);
  line(200, 225, 160, 225);
  line(240, 690, 240, 500);
  line(120, 690, 120, 500);
  line(40, 300, 100, 300);
  line(260, 300, 325, 300);
  line(40, 300, 40, 450);
  line(325, 300, 325, 450);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  ellipse(150, 170, 10, 10);
  ellipse(200, 180, 10, 10);

  rect(350, 440, 330, 150);
  rect(350, 440, 70, 30);
  fill(10, 10, 10);
  textSize(20);
  text("shmingo", 355, 445, 400, 200);
  textSize(30);
  text("we lost all of our books!", 355, 490, 400, 200);

  next = sk.addButton("next")
    .setPosition(650, 570)
    .setSize(30, 20);
}

void next() {
  next.remove();
  leave = sk.addButton("leave")
    .setPosition(650, 600)
    .setSize(30, 20);


  fill(1000, 1000, 1000);
  rect(350, 440, 330, 150);
  rect(350, 440, 70, 30);
  fill(10, 10, 10);
  textSize(20);
  text("shmingo", 355, 445, 400, 200);
  textSize(29);
  text("we need two specific books,", 355, 475, 400, 200);
  text("can you find them!?", 355, 515, 400, 200);
  text("they are in the library.", 355, 555, 400, 200);
}

void leave() {
  leave.remove();
  background(0, 255, 255);
  fill(230, 235, 190);
  rect(200, 350, 350, 250);
  fill(150, 80, 80);
  rect(160, 400, 80, 200);
  fill(1000, 1000, 0);
  ellipse(180, 500, 20, 20);
  fill(50, 150, 255);
  rect(390, 430, 120, 120);
  line(450, 430, 450, 550);
  line(390, 490, 510, 490);
  fill(1000, 10, 10);
  triangle(180, 350, 570, 350, 370, 180);
  fill(0, 1000, 0);
  rect(0, 600, 700, 700);
  fill(1000, 1000, 0);
  ellipse(10, 10, 200, 200);

  if (bookOne==1) {
    book1.remove();
  }

  home = sk.addButton("home")
    .setPosition(240, 400)
    .setSize(100, 200);

  left = sk.addButton("left")
    .setPosition(10, 400)
    .setSize(50, 30);
}

void left() {
  home.remove();
  left.remove();
  background(0, 255, 255);
  fill(192, 192, 192);
  rect(80, 350, 550, 250);
  fill(1000, 1000, 0);
  ellipse(180, 500, 20, 20);
  fill(50, 150, 255);
  rect(470, 430, 120, 120);
  line(530, 430, 530, 550);
  line(470, 490, 590, 490);
  rect(130, 430, 120, 120);
  line(190, 430, 190, 550);
  line(130, 490, 250, 490);
  fill(150, 80, 80);
  rect(220, 400, 80, 200);
  fill(1000, 1000, 0);
  ellipse(240, 500, 20, 20);
  fill(0, 1000, 0);
  rect(0, 600, 700, 700);
  fill(1000, 1000, 0);
  ellipse(10, 10, 200, 200);
  fill(0, 1000, 0);
  rect(0, 600, 700, 700);
  fill(1000, 1000, 0);
  ellipse(10, 10, 200, 200);

  if (bookTwo==1) {
    book2.remove();
  }

  library = sk.addButton("library")
    .setPosition(300, 400)
    .setSize(100, 200);
}

void home() {
  left.remove();
  home.remove();

  background(230, 235, 190);
  stroke(10, 10, 10);
  fill(150, 75, 0);
  rect(1, 600, 697, 697);
  fill(130, 80, 80);
  rect(400, 50, 250, 570);
  fill(150, 75, 75);
  rect(410, 60, 230, 550);
  strokeWeight(1);
  line(640, 150, 410, 150);
  line(640, 140, 410, 140);
  line(640, 240, 410, 240);
  line(640, 250, 410, 250);
  line(640, 340, 410, 340);
  line(640, 350, 410, 350);
  line(640, 440, 410, 440);
  line(640, 450, 410, 450);
  line(640, 540, 410, 540);
  line(640, 550, 410, 550);
  fill(10, 10, 10);
  rect(60, 90, 320, 320);
  fill(0, 255, 255);
  rect(70, 100, 300, 300);
  line(220, 240, 220, 90);
  line(380, 260, 60, 260);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  rect(130, 150, 100, 100);
  line(200, 225, 160, 225);
  line(240, 690, 240, 500);
  line(120, 690, 120, 500);
  line(40, 300, 100, 300);
  line(260, 300, 325, 300);
  line(40, 300, 40, 450);
  line(325, 300, 325, 450);
  fill(1000, 1000, 1000);
  rect(100, 250, 160, 250);
  ellipse(150, 170, 10, 10);
  ellipse(200, 180, 10, 10);

  fill(10, 10, 10);
  text(bookOne + bookTwo + " / 2 books", 50, 50);

  if (bookOne + bookTwo == 0) {
    println("we got no books, go get more!");
  }

  if (bookOne + bookTwo ==1) {
    fill(0, 0, 1000);
    rect(410, 60, 15, 80);
    println("great, 1 book, two more!");
  }

  if (bookOne + bookTwo==2) {
    fill(0, 0, 1000);
    rect(410, 60, 15, 80);
    fill(0, 1000, 0);
    rect(425, 60, 15, 80);
    fill(1000, 1000, 1000);
    rect(350, 440, 330, 150);
    rect(350, 440, 70, 30);
    fill(10, 10, 10);
    textSize(20);
    text("shmingo", 355, 445, 400, 200);
    textSize(30);
    text("you found the two books! ", 355, 475, 400, 200);
    text("this is insane!", 355, 515, 400, 200);
    text("great job!", 355, 555, 400, 200);

    finish = sk.addButton("finish")
      .setPosition(260, 200)
      .setSize(50, 30);
  }


  leave = sk.addButton("leave")
    .setPosition(330, 10)
    .setSize(50, 30);
}


void book1() {
  book1.remove();
  bookOne++;
  if (bookOne>=2) {
    bookOne--;
    println("you already have this book");
  } else {
    println("you have " + (bookOne + bookTwo) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + " / 2 books", 10, 30);
}

void book2() {
  book2.remove();

  bookTwo++;

  if (bookTwo >= 2) {
    println("you already have this book");
    bookTwo--;
  } else {
    println("you have " + (bookOne + bookTwo) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + " / 2 books", 10, 30);
}

void library() {
  background(230, 235, 190);
  leave.remove();
  library.remove();

  fill(150, 75, 0);
  rect(0, 600, 699, 699);
  fill(130, 80, 80);
  rect(50, 50, 600, 570);
  fill(150, 75, 75);
  rect(60, 60, 580, 550);
  strokeWeight(1);
  line(640, 150, 60, 150);
  line(640, 140, 60, 140);
  line(640, 240, 60, 240);
  line(640, 250, 60, 250);
  line(640, 340, 60, 340);
  line(640, 350, 60, 350);
  line(640, 440, 60, 440);
  line(640, 450, 60, 450);
  line(640, 540, 60, 540);
  line(640, 550, 60, 550);



  for (int space = 60; space <= 625; ) {
    fill(0, 1000, 0);
    rect(space, 450, 15, 90);
    fill(175, 100, 255);
    rect(space, 350, 15, 90);
    fill(75, 150, 0);
    rect(space, 250, 15, 90);
    fill(100, 175, 255);
    rect(space, 150, 15, 90);
    fill(0, 0, 1000);
    rect(space, 60, 15, 80);
    space = space + 15;
  }

  home = sk.addButton("home")
    .setPosition(330, 10)
    .setSize(50, 30);

  book1 = sk.addButton("book1")
    .setPosition(405, 60)
    .setSize(15, 80);

  book2 = sk.addButton("book2")
    .setPosition(210, 450)
    .setSize(15, 90);
}

void finish() {
  finish.remove();
  leave.remove();
  background(1000, 1000, 1000);
  image(img, 100, 100);
}