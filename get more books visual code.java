import controlP5.*;

ControlP5 sk;

void setup(){
  
   sk = new ControlP5(this);
  
  Button talk;
  
  talk = sk.addButton("talk")
  .setPosition(260,200)
  .setSize(50,40);
  
  size(700,700);
  background(230,235,190);
  fill(150,75,0);
  rect(1,600,697,697);
  fill(130,80,80);
  rect(400,50,250,570);
  fill(150,75,75);
  rect(410,60,230,550);
  strokeWeight(1);
  line(640,150,410,150);
  line(640,140,410,140);
  line(640,240,410,240);
  line(640,250,410,250);
  line(640,340,410,340);
  line(640,350,410,350);
  line(640,440,410,440);
  line(640,450,410,450);
  line(640,540,410,540);
  line(640,550,410,550);
  fill(10,10,10);
  rect(60,90,320,320);
  fill(0,255,255);
  rect(70,100,300,300);
  line(220,240,220,90);
  line(380,260,60,260);
  fill(1000,1000,1000);
  rect(100,250,160,250);
  rect(130,150,100,100);
  line(200,225,160,225);
  line(240,690,240,500);
  line(120,690,120,500);
  line(40,300,100,300);
  line(260,300,325,300);
  line(40,300,40,450);
  line(325,300,325,450);
  fill(1000,1000,1000);
  rect(100,250,160,250);
  ellipse(150,170,10,10);
  ellipse(200,180,10,10);  
}

void draw(){

  }
  
  void talk(){
    rect(350,440,330,150);
    rect(350,440,70,30);
    fill(10,10,10);
    textSize(20);
    text("shmingo",355,445,400,200);
    textSize(30);
    text("this bookshelf is completely empty", 355,490,400,200);
    
       Button next;
      
      next = sk.addButton("next")
      .setPosition(650,570)
      .setSize(30,20);
  }
  
  void next(){
    fill(1000,1000,1000);
      rect(350,440,330,150);
    rect(350,440,70,30);
    fill(10,10,10);
    textSize(20);
    text("shmingo",355,445,400,200);
    textSize(30);
    text("we need more books,", 355,490,400,200);
    text("go get more books!", 355,530,400,200);
  }