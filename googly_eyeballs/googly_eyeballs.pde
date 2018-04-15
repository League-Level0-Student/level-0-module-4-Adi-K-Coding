void setup() {
  size(800, 600);
}
void draw() {
  background(100, 150, 200);
  fill(250, 250, 250);
  ellipse(250, 200, 165, 100);
  ellipse(550, 200, 165, 100);
  fill(1, 1, 1);
int tempX=mouseX;
int tempY=mouseY;
  if (mouseX>310) {
  tempX=310; 
  } else if (mouseX<190) {
    tempX=190;
  }  if (mouseY>227) {
    tempY=227;
  } else if (mouseY<175) {
   tempY=175;
  } 
    ellipse(tempX, tempY, 50, 50);
    ellipse(tempX+300,tempY, 50, 50);
}