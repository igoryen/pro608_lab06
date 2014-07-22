// Toyota
class Body {
  color c; // color black
  float xpos; // x axis loc
  float ypos; // y axis loc
  float xspeed; // refresh rate? ms?

  Body(color tempC, float tempXpos, float tempYpos, float tempXspeed)  {    
    c = tempC;   
    xpos = tempXpos;   
    ypos = tempYpos;   
    xspeed = tempXspeed;   
  }

  void displayCar() {
    rectMode(CENTER);
    fill(c);
    rect(xpos,ypos,30,10);
  }
  void displayLongCar() {
    rectMode(CENTER);
    fill(c);
    rect(xpos,ypos,50,10);
  }
  void displayRain() {
    rectMode(CENTER);
    fill(c);
    line(xpos, ypos, xpos+10, ypos+10);;
  }
  /*
    30. start again from the bottom left corner of the pic frame
  */
  void moveEast() {
    xpos = xpos + xspeed;
    if (xpos > width){
      xpos = 0; // 30
    }
  }
  /*
    20. if it reaches the left side of the pic frame
    25. start again from the right side of the pic frame
  */
  void moveWest() {
    xpos = xpos - xspeed;
    if (xpos <= 0){ // 20
      xpos = width; // 25
    }
  }
  /*
    20. when the body reaches the right side of the pic frame
    25. the car will start from any point of the lower pic frame
    30. the body will always start moving from the bottom of the frame pic
  */
  void moveNorthEast(){
    xpos = xpos + 3;
    ypos = ypos-xspeed;
    if (xpos > width){ // 20
      xpos = random(-width/2, width/2); // 25
      ypos = width; // 30
    }
  }

  /*
    25. if the droplet flies out beyond the pic fame
    30. the point where droplet will fall from is 
        anywhere from -width, to +width
        so that the droplets will fall through
        every part of the picture
    35. the droplets will always fall from the top
        of the picture frame
  */
  void moveSouthEast(){
    xpos = xpos + 15;
    ypos = ypos + 15;
    if (xpos > width){ // 25
      xpos = random(-width, width); // 30
      ypos = 0; // 35
    }
  }
  
}


// Step 1. Declare an object.
Body Toyota;
Body Ferrari;
Body Ford;
Body Volvo;
Body Droplet1;
Body Droplet2;
Body Droplet3;
Body Droplet4;
Body Droplet5;
Body Droplet6;
Body Droplet7;
Body Droplet8;

void setup()  {   

  int moveSlow = 1;
  int moveFast = 3;
  int moveVFast = 5; 

  int blue = color(0,0,255);
  int red = color(255,0,0);
  int green = color(0,128,0);
  int black = color(0,0,0);
  int aqua = color(0,255,255);

  size(200,200); // canvas size

  // Step 2. Initialize object.
  Toyota = new Body(blue, 2,150,moveSlow); 
  Ferrari = new Body(red, 50,100,moveFast); 
  Ford = new Body(green, width, 180, moveVFast);
  Volvo = new Body(black, 0, 0, moveFast);

  Droplet1 = new Body(aqua, 0, 10, moveFast);
  Droplet2 = new Body(aqua, 50, 20, moveFast);
  Droplet3 = new Body(aqua, 100, 30, moveFast);
  Droplet4 = new Body(aqua, 150, 40, moveFast);
  Droplet5 = new Body(aqua, 0, 10, moveFast);
  Droplet6 = new Body(aqua, 50, 20, moveFast);
  Droplet7 = new Body(aqua, 100, 30, moveFast);
  Droplet8 = new Body(aqua, 150, 40, moveFast);
}

void draw()  {    
  background(255);  
  // Step 3. Call methods on the object. 
  Toyota.moveEast();   
  Toyota.displayLongCar(); 

  Ferrari.moveEast();
  Ferrari.displayCar();

  Ford.moveWest();
  Ford.displayCar(); 

  Volvo.moveNorthEast();
  Volvo.displayCar();

  Droplet1.moveSouthEast();
  Droplet1.displayRain();

  Droplet2.moveSouthEast();
  Droplet2.displayRain();

  Droplet3.moveSouthEast();
  Droplet3.displayRain();

  Droplet4.moveSouthEast();
  Droplet4.displayRain();

  Droplet5.moveSouthEast();
  Droplet5.displayRain();

  Droplet6.moveSouthEast();
  Droplet6.displayRain();

  Droplet7.moveSouthEast();
  Droplet7.displayRain();

  Droplet8.moveSouthEast();
  Droplet8.displayRain();
}   
