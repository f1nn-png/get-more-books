import controlP5.*;

ControlP5 sk;
Button talk;
Button next;
Button leave;
Button left;
Button Back;
Button home;
Button libraryHall;
Button bookshelf1;
Button book1;
Button book2;
Button book3;
Button book4;
Button book5;
Button book6;
Button book7;
Button book8;
Button book9;
Button book10;
Button finish;
Button done;

PImage img;

int inventory = 0;

int bookOne = 0;
int bookTwo = 0;
int bookThree = 0;
int bookFour = 0;
int bookFive = 0;
int bookSix = 0;
int bookSeven = 0;
int bookEight = 0;
int bookNine = 0;
int bookTen = 0;

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
  fill(114, 70, 70);
  rect(410, 550, 230, 60);
}

void draw() {
}

void keyReleased() {
  if (inventory == 0) {
    inventory = 1;
    println("open");
          fill(10,10,10,200);
          stroke(10,10,10,0);
    rect(30,30,640,610);
    
      bookshelf1 = sk.addButton("bookshelf1")
    .setPosition(630, 620)
    .setSize(50, 40);
    
     book1.remove();
     book2.remove();
     book3.remove();
     book4.remove();
     book5.remove();
     book6.remove();
     book7.remove();
     book8.remove();
     book9.remove();
     book10.remove();
    
    if(bookOne == 1){
      fill(0,0,1000);
      stroke(10,10,10);
    rect(100,100,60,90);
    fill(10,10,10);
    textSize(20);
    text("book1",110,145);
  }
      if(bookTwo == 1){
      fill(0,1000,0);
      stroke(10,10,10);
    rect(200,100,60,90);
        fill(10,10,10);
    textSize(20);
    text("book2",210,145);
  }
        if(bookThree == 1){
      fill(0,1000,0);
      stroke(10,10,10);
    rect(300,100,60,90);
            fill(10,10,10);
    textSize(20);
    text("book3",310,145);
  }
        if(bookFour == 1){
      fill(175, 100, 255);
      stroke(10,10,10);
    rect(400,100,60,90);
            fill(10,10,10);
    textSize(20);
    text("book4",410,145);
  }
        if(bookFive == 1){
      fill(175, 100, 255);
      stroke(10,10,10);
    rect(500,100,60,90);
            fill(10,10,10);
    textSize(20);
    text("book5",510,145);
  }
        if(bookSix == 1){
      fill(75, 150, 0);
      stroke(10,10,10);
    rect(100,300,60,90);
    fill(10,10,10);
    textSize(20);
    text("book6",110,345);
  }
        if(bookSeven == 1){
      fill(0,0,1000);
      stroke(10,10,10);
    rect(200,300,60,90);
    fill(10,10,10);
    textSize(20);
    text("book7",210,345);
  }
        if(bookEight == 1){
      fill(100, 175, 255);
      stroke(10,10,10);
    rect(300,300,60,90);
        fill(10,10,10);
    textSize(20);
    text("book8",310,345);
  }
        if(bookNine == 1){
      fill(75, 150, 0);
      stroke(10,10,10);
    rect(400,300,60,90);
        fill(10,10,10);
    textSize(20);
    text("book9",410,345);
  }
        if(bookTen == 1){
      fill(100, 175, 255);
      stroke(10,10,10);
    rect(500,300,60,90);
        fill(10,10,10);
    textSize(20);
    text("book10",505,345);
  }
  } else {
    println("close");
    inventory = 0;
  }
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
  fill(114, 70, 70);
  rect(410, 550, 230, 60);

  fill(1000, 1000, 1000);
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

  libraryHall = sk.addButton("libraryHall")
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
  fill(114, 70, 70);
  rect(410, 550, 230, 60);

textSize(30);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 50, 50);

  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 0) {
    println("we got no books, go get more!");
  }


  leave = sk.addButton("leave")
    .setPosition(330, 10)
    .setSize(50, 30);
}

void libraryHall() {
  background(230, 235, 190);
  libraryHall.remove();

  fill(135, 77, 47);
  rect(90, 190, 220, 420);
  fill(150, 75, 0);
  rect(0, 600, 699, 699);
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
  fill(114, 70, 70);
  rect(410, 550, 230, 60);

  for (int bungo = 410; bungo <= 625; ) {
    fill(255, 128, 0);
    rect(bungo, 450, 15, 90);
    fill(51, 255, 153);
    rect(bungo, 350, 15, 90);
    fill(204, 204, 255);
    rect(bungo, 250, 15, 90);
    fill(204, 255, 153);
    rect(bungo, 150, 15, 90);
    fill(255, 102, 178);
    rect(bungo, 60, 15, 80);
    bungo = bungo + 15;
  }
  
      fill(1000, 1000, 1000);
  rect(350, 440, 330, 150);
  rect(350, 440, 70, 30);
  fill(10, 10, 10);
  textSize(20);
  text("shmingo", 355, 445, 400, 200);
  textSize(30);
  text("remember: ", 355, 470, 400, 200);
    text("make sure the books are not  ", 355, 500, 400, 200);
    text("blue when you leave! ", 355, 530, 400, 200);

  bookshelf1 = sk.addButton("bookshelf1")
    .setPosition(100, 200)
    .setSize(200, 400);
}

void bookshelf1() {
  background(230, 235, 190);
  leave.remove();
  bookshelf1.remove();

textSize(30);
  stroke(10,10,10);
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
  fill(114, 70, 70);
  rect(60, 550, 580, 60);

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

  book1 = sk.addButton("book1")
    .setPosition(405, 60)
    .setSize(15, 80);

  book2 = sk.addButton("book2")
    .setPosition(210, 450)
    .setSize(15, 90);

  book3 = sk.addButton("book3")
    .setPosition(330, 450)
    .setSize(15, 90);

  book4 = sk.addButton("book4")
    .setPosition(360, 350)
    .setSize(15, 90);

  book5 = sk.addButton("book5")
    .setPosition(135, 350)
    .setSize(15, 90);

  book6 = sk.addButton("book6")
    .setPosition(195, 250)
    .setSize(15, 90);

  book7 = sk.addButton("book7")
    .setPosition(210, 60)
    .setSize(15, 80);

  book8 = sk.addButton("book8")
    .setPosition(105, 150)
    .setSize(15, 90);

  book9 = sk.addButton("book9")
    .setPosition(495, 250)
    .setSize(15, 90);

  book10 = sk.addButton("book10")
    .setPosition(435, 150)
    .setSize(15, 90);
}

void book1() {
  book1.remove();
  bookOne++;
  if (bookOne>=2) {
    bookOne--;
    println("you already have this book");
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book2() {
  book2.remove();
  bookTwo++;

  if (bookTwo >= 2) {
    println("you already have this book");
    bookTwo--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");


    if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
      done = sk.addButton("done")
        .setPosition(330, 10)
        .setSize(50, 30);
    }
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);
}

void book3() {
  book3.remove();

  bookThree++;

  if (bookThree >= 2) {
    println("you already have this book");
    bookThree--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book4() {
  book4.remove();

  bookFour++;

  if (bookFour >= 2) {
    println("you already have this book");
    bookFour--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book5() {
  book5.remove();

  bookFive++;

  if (bookFive >= 2) {
    println("you already have this book");
    bookFive--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book6() {
  book6.remove();

  bookSix++;

  if (bookSix >= 2) {
    println("you already have this book");
    bookSix--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book7() {
  book7.remove();

  bookSeven++;

  if (bookSeven >= 2) {
    println("you already have this book");
    bookSeven--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}
void book8() {
  book8.remove();

  bookEight++;

  if (bookEight >= 2) {
    println("you already have this book");
    bookEight--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void book9() {
  book9.remove();

  bookNine++;

  if (bookNine >= 2) {
    println("you already have this book");
    bookTwo--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}
void book10() {
  book10.remove();

  bookTen++;

  if (bookTen >= 2) {
    println("you already have this book");
    bookTen--;
  } else {
    println("you have " + (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen) + " books");
  }

  stroke(230, 235, 190);
  fill(230, 235, 190);
  rect(10, 10, 150, 38);
  fill(10, 10, 10);
  text(bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen + " / 10 books", 10, 30);


  if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen == 10) {
    done = sk.addButton("done")
      .setPosition(330, 10)
      .setSize(50, 30);
  }
}

void done() {
  done.remove();
  if (inventory <= 3) {
    book1.remove();
    book2.remove();
    book3.remove();
    book4.remove();
    book5.remove();
    book6.remove();
    book7.remove();
    book8.remove();
    book9.remove();
    book10.remove();
  }
  
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
  fill(114, 70, 70);
  rect(410, 550, 230, 60);

  
    if (bookOne + bookTwo + bookThree + bookFour + bookFive + bookSix + bookSeven + bookEight + bookNine + bookTen >=10) {
    fill(0, 0, 1000);
    rect(410, 60, 15, 80);
    rect(425, 60, 15, 80);
    fill(175, 100, 255);
    rect(440, 60, 15, 80);
    rect(455, 60, 15, 80);
    fill(0, 1000, 0);
    rect(470, 60, 15, 80);
    rect(485, 60, 15, 80);
    fill(75, 150, 0);
    rect(500, 60, 15, 80);
    rect(515, 60, 15, 80);
    fill(100, 175, 255);
    rect(530, 60, 15, 80);
    rect(545, 60, 15, 80);
    fill(1000, 1000, 1000);
    rect(350, 440, 330, 150);
    rect(350, 440, 70, 30);
    fill(10, 10, 10);
    textSize(20);
    text("shmingo", 355, 445, 400, 200);
    textSize(30);
    text("you found all ten books! ", 355, 475, 400, 200);
    text("this is insane!", 355, 515, 400, 200);
    text("great job!", 355, 555, 400, 200);

    finish = sk.addButton("finish")
      .setPosition(260, 200)
      .setSize(50, 30);
  }
  
}

void finish(){
   finish.remove();
  background(1000, 1000, 1000);
  image(img, 100, 100); 
}
