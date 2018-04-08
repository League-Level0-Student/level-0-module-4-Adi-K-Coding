void setup(){
size(800,600);
}
void draw(){
background(100,150,200);
  fill(250,250,250);
  ellipse(250,200,165,100);
ellipse(550,200,165,100);
fill(1,1,1);

if(mouseX>310){
ellipse(310,mouseY,50,50);
  ellipse(310+300,mouseY,50,50);
}else if(mouseX<190){
ellipse(190,mouseY,50,50);
  ellipse(190+300,mouseY,50,50);
}
else{
ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX+300,mouseY,50,50);
}

}