// Traffic in the rain
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

  void display() {
    rectMode(CENTER);
    fill(c);
    rect(xpos,ypos,30,10);
  }

  void moveEast() {
    xpos = xpos + xspeed;
    if (xpos > width){ // if it reaches the side
      xpos = 0; // move back to the beginning = set xpos back to 0
    }
  }

  void moveWest() {
    xpos = xpos - xspeed;
    if (xpos <= 0){ // if it reaches the left side
      xpos = width; // move back to the right side = set xpos back to "width"
    }
  }

  void moveNorthEast(){
    xpos = xpos + xspeed;
    ypos = ypos+3;
    if (xpos > width){ // if it reaches the left side
      xpos = 0; // move back to the right side = set xpos back to "width"
      ypos = 0;
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
  Volvo = new Body(black, 180, 2, moveFast);
  Droplet1 = new Body(aqua, 0, 10, moveFast);
  Droplet2 = new Body(aqua, 50, 20, moveFast);
  Droplet3 = new Body(aqua, 100, 30, moveFast);
  Droplet4 = new Body(aqua, 150, 40, moveFast);
}

void draw()  {    
  background(255);  
  // Step 3. Call methods on the object. 
  Toyota.moveEast();   
  Toyota.display(); 

  Ferrari.moveEast();
  Ferrari.display();

  Ford.moveWest();
  Ford.display(); 

  Volvo.moveNorthEast();
  Volvo.display();

  Droplet1.fall();
  Droplet1.display();

  Droplet2.fall();
  Droplet2.display();

  Droplet3.fall();
  Droplet3.display();

  Droplet4.fall();
  Droplet4.display();
}   

