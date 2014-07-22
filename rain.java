// Toyota
class Car {
  color c; // color black
  float xpos; // x axis loc
  float ypos; // y axis loc
  float xspeed; // refresh rate? ms?

  Car(color tempC, float tempXpos, float tempYpos, float tempXspeed)  {    
    c = tempC;   
    xpos = tempXpos;   
    ypos = tempYpos;   
    xspeed = tempXspeed;   
  }

  void display() {
    rectMode(CENTER);
    fill(c);
    rect(xpos,ypos,30,10);
  }

  void driveEast() {
    xpos = xpos + xspeed;
    if (xpos > width){ // if it reaches the side
      xpos = 0; // move back to the beginning = set xpos back to 0
    }
  }

  void driveWest() {
    xpos = xpos - xspeed;
    if (xpos <= 0){ // if it reaches the left side
      xpos = width; // move back to the right side = set xpos back to "width"
    }
  }

  void driveNorthEast(){
    xpos = xpos + xspeed;
    ypos = ypos+3;
    if (xpos > width){ // if it reaches the left side
      xpos = 0; // move back to the right side = set xpos back to "width"
      ypos = 0;
    }
  }
  
}

class Rain(){
  float xloc; // x axis loc
  float yloc; // y axis loc
  float xvelocity; // refresh rate? ms?

  Rain(float tempXpos, float tempYpos, float tempXspeed){
    xloc = tempXpos;   
    yloc = tempYpos;   
    xvelocity = tempXspeed; 
  }
  void fall(){
    xloc = xloc + xvelocity;
    yloc = yloc + 1;
  }
}


// Step 1. Declare an object.
Car Toyota;
Car Ferrari;
Car Ford;
Car Volvo;
Rain Shower;

void setup()  {   

  int moveSlow = 1;
  int moveFast = 3;
  int moveVFast = 5; 

  int blue = color(0,0,255);
  int red = color(255,0,0);
  int green = color(0,128,0);
  int black = color(0,0,0);

  size(200,200); // canvas size

  // Step 2. Initialize object.
  Toyota = new Car(blue, 2,150,moveSlow); 
  Ferrari = new Car(red, 50,100,moveFast); 
  Ford = new Car(green, width, 180, moveVFast);
  Volvo = new Car(black, 180, 2, moveFast);
  Shower = new Rain(0, 0, moveFast);
}

void draw()  {    
  background(255);  
  // Step 3. Call methods on the object. 
  Toyota.driveEast();   
  Toyota.display(); 

  Ferrari.driveEast();
  Ferrari.display();

  Ford.driveWest();
  Ford.display(); 

  Volvo.driveNorthEast();
  Volvo.display();

  Rain.fall();
  Rain.display();
}   
