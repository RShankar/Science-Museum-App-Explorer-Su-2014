package processing.test.modsapp_v2;
import processing.test.modsapp_v2.Schedule;
import ketai.net.nfc.KetaiNFC;
import ketai.ui.KetaiGesture;
import processing.core.PApplet;
import processing.core.PImage;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;


public class MODSAPP_v2 extends PApplet {
	
	// Creates variables for page navigation, map orientation, and images. 
	
	 

	int tagValue;
	int ptagValue;
	int pageNumber;
	int ppageNumber;
	int mapToggle;
	int imageNumber;
	int pictureCount;
	int stickerPageNumber;
	boolean prehistoricBoolean, evergladesBoolean, goGreenBoolean;
	boolean otterBoolean, powerfulYouBoolean, ecoScapesBoolean;
	boolean aviationStationBoolean, stormCenterBoolean, waterStoryBoolean;
	String userName;
	KetaiNFC ketaiNFC;
	float mapX, mapY, mapWidth, mapHeight;
	float zoomX, zoomY;
	PImage mapFloor1, mapFloor2; 
	PImage aviationStation1, aviationStation2, aviationStation3, aviationStation4, aviationStation5;
	PImage discoveryCenter1;
	PImage ecoScapes1, ecoScapes2, ecoScapes3, ecoScapes4, ecoScapes5, ecoScapes6, ecoScapes7, ecoScapes8;
	PImage everglades1, everglades2;
	PImage gizmoCity1;
	PImage goGreen1, goGreen2, goGreen3;
	PImage otter1, otter2;
	PImage powerfulYou1, powerfulYou2, powerfulYou3, powerfulYou4, powerfulYou5, powerfulYou6, powerfulYou7;
	PImage prehistoric1, prehistoric2;
	PImage stormCenter1, stormCenter2, stormCenter3, stormCenter4, stormCenter5, stormCenter6;
	PImage waterStory1, waterStory2, waterStory3, waterStory4, waterStory5, waterStory6, waterStory7;
	PImage arrowLeft, arrowRight;
	PImage stickerPrehistoric, stickerPrehistoricGray, stickerEverglades, stickerEvergladesGray, stickerGoGreen, stickerGoGreenGray;
	PImage stickerOtter, stickerOtterGray, stickerPowerfulYou, stickerPowerfulYouGray, stickerEcoScapes, stickerEcoScapesGray;
	PImage stickerAviationStation, stickerAviationStationGray, stickerStormCenter, stickerStormCenterGray, stickerWaterStory, stickerWaterStoryGray; 
	KetaiGesture gesture;
	Context context = this;
	
	

public void setup() {   
	  
	  //Sets orientation and instantiates variables 
	
	  smooth();
	  imageMode(CENTER);
	  orientation(PORTRAIT);
	  textSize(36);
	  textAlign(CENTER, CENTER);
	  fill(255);
	  mapWidth = width;
	  mapHeight = 9*height/10;
	  mapX = mapWidth/2;
	  mapY = mapHeight/2;
	  pageNumber = 1;
	  mapToggle = 1;
	  tagValue = 0;
	  ptagValue = 0;
	  imageNumber = 1;
	  pictureCount = 0;
	  gesture = new KetaiGesture(this);
	  
	  //establishes images as part of the PImage Class
	  
	  mapFloor1 = new PImage();
	  mapFloor2 = new PImage();
	  aviationStation1 = new PImage();
	  aviationStation2 = new PImage();
	  aviationStation3 = new PImage();
	  aviationStation4 = new PImage();
	  aviationStation5 = new PImage();
	  discoveryCenter1 = new PImage();
	  ecoScapes1 = new PImage();
	  ecoScapes2 = new PImage();
	  ecoScapes3 = new PImage();
	  ecoScapes4= new PImage();
	  ecoScapes5 = new PImage();
	  ecoScapes6 = new PImage();
	  ecoScapes7 = new PImage();
	  ecoScapes8 = new PImage();
	  everglades1 = new PImage();
	  everglades2 = new PImage();
	  gizmoCity1 = new PImage();
	  goGreen1 = new PImage();
	  goGreen2 = new PImage();
	  goGreen3 = new PImage();
	  otter1 = new PImage();
	  otter2 = new PImage();
	  powerfulYou1 = new PImage();
	  powerfulYou2 = new PImage();
	  powerfulYou3 = new PImage();
	  powerfulYou4 = new PImage();
	  powerfulYou5 = new PImage();
	  powerfulYou6 = new PImage();
	  powerfulYou7 = new PImage();
	  prehistoric1 = new PImage();
	  prehistoric2 = new PImage();
	  stormCenter1 = new PImage();
	  stormCenter2 = new PImage();
	  stormCenter3 = new PImage();
	  stormCenter4 = new PImage();
	  stormCenter5 = new PImage();
	  stormCenter6 = new PImage();
	  waterStory1 = new PImage();
	  waterStory2 = new PImage();
	  waterStory3 = new PImage();
	  waterStory4 = new PImage();
	  waterStory5 = new PImage();
	  waterStory6 = new PImage();
	  waterStory7 = new PImage();
	  arrowLeft = new PImage();
	  arrowRight = new PImage();
	  stickerPrehistoric = new PImage();
	  stickerPrehistoricGray = new PImage();
	  stickerEverglades = new PImage();
	  stickerEvergladesGray = new PImage();
	  stickerGoGreen = new PImage();
	  stickerGoGreenGray = new PImage();
	  stickerOtter = new PImage();
	  stickerOtterGray = new PImage();
	  stickerPowerfulYou = new PImage();
	  stickerPowerfulYouGray = new PImage();
	  stickerEcoScapes = new PImage();
	  stickerEcoScapesGray = new PImage();
	  stickerAviationStation = new PImage();
	  stickerAviationStationGray = new PImage();
	  stickerStormCenter = new PImage();
	  stickerStormCenterGray = new PImage();
	  stickerWaterStory = new PImage();
	  stickerWaterStoryGray = new PImage();
	  
	  //loads images from the assets folder
	  
	  mapFloor1 = loadImage("mapFloor1.png");
	  mapFloor2 = loadImage("mapFloor2.png");
	  
	  arrowLeft = loadImage("Arrow Left.png");
	  arrowRight = loadImage("Arrow Right.png");
	  
	 
	  
	  
	
}

public void draw() {
	
	if(tagValue != ptagValue) {
		imageNumber = 1;
	}
		
	/*
	 * displays page if the pageNumber integer == 1, 2, 3, or 
	 * does nothing if pageNumber == 0
	 */
if(pageNumber!=1 && pageNumber!=2 && pageNumber!=3 && pageNumber!=4) {
	
}
if (pageNumber == 1) {
  homePage();
}
if (pageNumber == 2) {
  mapPage();
}
if (pageNumber == 3) {
  exhibitsPage();
}
if (pageNumber == 4) {
  stickersPage();
}
  
/* 
 * switch statement switches between tagValue integer values
 * based on the value of tagValue, the draw() method displays the correct exhibit page
 * pageNumber is set to 0 so that none of the main pages are displayed
 * pictureCount is set to the total number of pictures in that particular exhibit page
 */

  switch(tagValue) {
    case 0:
	break;
  
    case 1:
    pageNumber = 0;
	pictureCount = 5;
    aviationStation();
    aviationStationBoolean = true;
    break;
    
    case 2:
    pageNumber = 0;
    pictureCount = 1;
    discoveryCenter();
    break;
    
    case 3:
    pageNumber = 0;
	pictureCount = 0;
    discoveryLab();
    break;
    
    case 4:
    pageNumber = 0;
    pictureCount = 8;
    ecoScapes();
    ecoScapesBoolean = true;
    break;
    
    case 5: 
    pageNumber = 0;
    pictureCount = 2;
    everglades();
    evergladesBoolean = true;
    break;
    
    case 6:
    pageNumber = 0;
    pictureCount = 1;
    gizmoCity();
    break;
    
    case 7:
    pageNumber = 0;
    pictureCount = 3;
    goGreen();
    goGreenBoolean = true;
    break;
    
    case 8:
    pageNumber = 0;
    pictureCount = 2;
    otter();
    otterBoolean = true;
    break;
    
    case 9:
    pageNumber = 0;
    pictureCount = 7;
    powerfulYou();
    powerfulYouBoolean = true;
    break;
    
    case 10:
    pageNumber = 0;
    pictureCount = 2;
    prehistoric();
    prehistoricBoolean = true;
    break;
    
    case 11:
    pageNumber = 0;
    pictureCount = 6;
    stormCenter();
    stormCenterBoolean = true;
    break;
    
    case 12:
    pageNumber = 0;
    pictureCount = 7;
    waterStory();
    waterStoryBoolean = true;
    break;
    
  }

  //menu bar is drawn
  
rect(0, 9*height/10, width, height/10);

//if the tag value changes, the imageNumber is set to 1 to start at image number 1



//arrow buttons are drawn

if(tagValue != 0 || pageNumber == 4) {
	image(arrowLeft, width/20, 17*height/20, width/10, height/10);
	image(arrowRight, 19*width/20, 17*height/20, width/10, height/10);
}




//tagValue is set to ptagValue after the check above

ptagValue = tagValue;
ppageNumber = pageNumber;
  
}

//tagValue is set to the value of the NFC tag
public void onNFCEvent(String txt) { //(2)
  tagValue = Integer.parseInt(trim(txt)); //(3)
  g.removeCache(stickerPrehistoric);
	g.removeCache(stickerPrehistoricGray);
	g.removeCache(stickerEverglades);
	g.removeCache(stickerEvergladesGray);
	g.removeCache(stickerGoGreen);
	g.removeCache(stickerGoGreenGray);
	g.removeCache(stickerOtter);
	g.removeCache(stickerOtterGray);
	g.removeCache(stickerPowerfulYou);
	g.removeCache(stickerPowerfulYouGray);
	g.removeCache(stickerEcoScapes);
	g.removeCache(stickerEcoScapesGray);
	g.removeCache(stickerAviationStation);
	g.removeCache(stickerAviationStationGray);
	g.removeCache(stickerStormCenter);
	g.removeCache(stickerStormCenterGray);
	g.removeCache(stickerWaterStory);
	g.removeCache(stickerWaterStoryGray);
	
	 aviationStation1 = loadImage("aviationStation_1.JPG");
	  aviationStation2 = loadImage("aviationStation_2.JPG");
	  aviationStation3 = loadImage("aviationStation_3.JPG");
	  aviationStation4 = loadImage("aviationStation_4.JPG");
	  aviationStation5 = loadImage("aviationStation_5.JPG");
	  discoveryCenter1 = loadImage("discoveryCenter_1.JPG");
	  ecoScapes1 = loadImage("ecoScapes_1.JPG");
	  ecoScapes2 = loadImage("ecoScapes_2.JPG");
	  ecoScapes3 = loadImage("ecoScapes_3.JPG");
	  ecoScapes4= loadImage("ecoScapes_4.JPG");
	  ecoScapes5 = loadImage("ecoScapes_5.JPG");
	  ecoScapes6 = loadImage("ecoScapes_6.JPG");
	  ecoScapes7 = loadImage("ecoScapes_7.JPG");
	  ecoScapes8 = loadImage("ecoScapes_8.JPG");
	  everglades1 = loadImage("everglades_1.JPG");
	  everglades2 = loadImage("everglades_2.JPG");
	  gizmoCity1 = loadImage("gizmoCity_1.JPG");
	  goGreen1 = loadImage("goGreen_1.JPG");
	  goGreen2 = loadImage("goGreen_2.JPG");
	  goGreen3 = loadImage("goGreen_3.JPG");
	  otter1 = loadImage("otter_1.png");
	  otter2 = loadImage("otter_2.JPG");
	  powerfulYou1 = loadImage("powerfulYou_1.JPG");
	  powerfulYou2 = loadImage("powerfulYou_2.JPG");
	  powerfulYou3 = loadImage("powerfulYou_3.JPG");
	  powerfulYou4 = loadImage("powerfulYou_4.JPG");
	  powerfulYou5 = loadImage("powerfulYou_5.JPG");
	  powerfulYou6 = loadImage("powerfulYou_6.JPG");
	  powerfulYou7 = loadImage("powerfulYou_7.JPG");
	  prehistoric1 = loadImage("prehistoric_1.png");
	  prehistoric2 = loadImage("prehistoric_2.JPG");
	  stormCenter1 = loadImage("stormCenter_1.JPG");
	  stormCenter2 = loadImage("stormCenter_2.JPG");
	  stormCenter3 = loadImage("stormCenter_3.JPG");
	  stormCenter4 = loadImage("stormCenter_4.JPG");
	  stormCenter5 = loadImage("stormCenter_5.png");
	  stormCenter6 = loadImage("stormCenter_6.JPG");
	  waterStory1 = loadImage("waterStory_1.JPG");
	  waterStory2 = loadImage("waterStory_2.JPG");
	  waterStory3 = loadImage("waterStory_3.JPG");
	  waterStory4 = loadImage("waterStory_4.JPG");
	  waterStory5 = loadImage("waterStory_5.JPG");
	  waterStory6 = loadImage("waterStory_6.JPG");
	  waterStory7 = loadImage("waterStory_7.JPG");
}

/*
 * if the screen is pressed 
 */

public void mousePressed() {
    if(mouseX>0 && mouseX<(width/4) && mouseY>(9*height/10) && mouseX<height) {
      pageNumber = 1;
      tagValue = 0;
    }
    if(mouseX>(width/4) && mouseX<(width/2) && mouseY>(9*height/10) && mouseX<(height) && pageNumber != 2) {
    	mapWidth = width;
		mapHeight = 9*height/10; 
		mapX = mapWidth/2;
		mapY = mapHeight/2;
		mapToggle = 1;
    	pageNumber = 2;
        tagValue = 0;
    } 
    if(mouseX>(width/2) && mouseX<(3*width/4) && mouseY>(9*height/10) && mouseX<(height)) {
          pageNumber = 3;
          tagValue = 0;
          
    }
    if(mouseX>(3*(width/4)) && mouseX<(width) && mouseY>(9*height/10) && mouseX<(height)) {
            
    	g.removeCache(aviationStation1);
    	g.removeCache(aviationStation2);
    	g.removeCache(aviationStation3);
    	g.removeCache(aviationStation4);
    	g.removeCache(aviationStation5);
    	g.removeCache(discoveryCenter1);
    	g.removeCache(ecoScapes1);
    	g.removeCache(ecoScapes2);
    	g.removeCache(ecoScapes3);
    	g.removeCache(ecoScapes4);
    	g.removeCache(ecoScapes5);
    	g.removeCache(ecoScapes6);
    	g.removeCache(ecoScapes7);
    	g.removeCache(ecoScapes8);
    	g.removeCache(everglades1);
    	g.removeCache(everglades2);
    	g.removeCache(gizmoCity1);
    	g.removeCache(goGreen1);
    	g.removeCache(goGreen2);
    	g.removeCache(goGreen3);
    	g.removeCache(otter1);
    	g.removeCache(otter2);
    	g.removeCache(powerfulYou1);
    	g.removeCache(powerfulYou2);
    	g.removeCache(powerfulYou3);
    	g.removeCache(powerfulYou4);
    	g.removeCache(powerfulYou5);
    	g.removeCache(powerfulYou6);
    	g.removeCache(powerfulYou7);
    	g.removeCache(prehistoric1);
    	g.removeCache(prehistoric2);
    	g.removeCache(stormCenter1);
    	g.removeCache(stormCenter2);
    	g.removeCache(stormCenter3);
    	g.removeCache(stormCenter4);
    	g.removeCache(stormCenter5);
    	g.removeCache(stormCenter6);
    	g.removeCache(waterStory1);
    	g.removeCache(waterStory2);
    	g.removeCache(waterStory3);
    	g.removeCache(waterStory4);
    	g.removeCache(waterStory5);
    	g.removeCache(waterStory6);
    	g.removeCache(waterStory7);
    		  
    		  stickerPrehistoric = loadImage("Sticker_Prehistoric.png");
    		  stickerPrehistoricGray = loadImage("Sticker_Prehistoric_Grayscale.png");
    		  stickerEverglades = loadImage("Sticker_Everglades.png");
    		  stickerEvergladesGray = loadImage("Sticker_Everglades_Grayscale.png");
    		  stickerGoGreen = loadImage("Sticker_GoGreen.png");
    		  stickerGoGreenGray = loadImage("Sticker_GoGreen_Grayscale.png");
    		  stickerOtter = loadImage("Sticker_Otter.png");
    		  stickerOtterGray = loadImage("Sticker_Otter_Grayscale.png");
    		  stickerPowerfulYou = loadImage("Sticker_PowerfulYou.png");
    		  stickerPowerfulYouGray = loadImage("Sticker_PowerfulYou_Grayscale.png");
    		  stickerEcoScapes = loadImage("Sticker_Ecoscapes.png");
    		  stickerEcoScapesGray = loadImage("Sticker_Ecoscapes_Grayscale.png");
    		  stickerAviationStation = loadImage("Sticker_Space.png");
    		  stickerAviationStationGray = loadImage("Sticker_Space_Grayscale.png");
    		  stickerStormCenter = loadImage("Sticker_Storm.png");
    		  stickerStormCenterGray = loadImage("Sticker_Storm_Grayscale.png");
    		  stickerWaterStory = loadImage("Sticker_WaterCycle.png");
    		  stickerWaterStoryGray = loadImage("Sticker_WaterCycle_Grayscale.png");
    	
    		pageNumber = 4;
            tagValue = 0;
    }
    
    if(tagValue != 0 && mouseX>0 && mouseX<width/10 && mouseY>8*height/10 && mouseY<9*height/10) {
    	if(imageNumber>1) {
    		imageNumber--;
    	} else {
    		imageNumber = pictureCount;
    	}
    }
    if(tagValue != 0 && mouseX>9*width/10 && mouseX<width && mouseY>8*height/10 && mouseY<9*height/10) {
    	if(imageNumber<pictureCount) {
    		imageNumber++;
    	} else {
    		imageNumber = 1;
    	}
    }
    if(pageNumber == 4 && mouseX>0 && mouseX<width/10 && mouseY>8*height/10 && mouseY<9*height/10) {
    	if(stickerPageNumber>1) {
    		stickerPageNumber--;
    	} else {
    		stickerPageNumber = 3;
    	}
    }
    if(pageNumber == 4 && mouseX>9*width/10 && mouseX<width && mouseY>8*height/10 && mouseY<9*height/10) {
    	if(stickerPageNumber<3) {
    		imageNumber++;
    	} else {
    		imageNumber = 1;
    	}
    }
}

public void onTap(float x, float y) {
    zoomX = mapWidth/width;
	zoomY = mapHeight/(9*height/10);
	
	if(pageNumber == 2) {
		
		g.removeCache(stickerPrehistoric);
		g.removeCache(stickerPrehistoricGray);
		g.removeCache(stickerEverglades);
		g.removeCache(stickerEvergladesGray);
		g.removeCache(stickerGoGreen);
		g.removeCache(stickerGoGreenGray);
		g.removeCache(stickerOtter);
		g.removeCache(stickerOtterGray);
		g.removeCache(stickerPowerfulYou);
		g.removeCache(stickerPowerfulYouGray);
		g.removeCache(stickerEcoScapes);
		g.removeCache(stickerEcoScapesGray);
		g.removeCache(stickerAviationStation);
		g.removeCache(stickerAviationStationGray);
		g.removeCache(stickerStormCenter);
		g.removeCache(stickerStormCenterGray);
		g.removeCache(stickerWaterStory);
		g.removeCache(stickerWaterStoryGray);
		
		 aviationStation1 = loadImage("aviationStation_1.JPG");
		  aviationStation2 = loadImage("aviationStation_2.JPG");
		  aviationStation3 = loadImage("aviationStation_3.JPG");
		  aviationStation4 = loadImage("aviationStation_4.JPG");
		  aviationStation5 = loadImage("aviationStation_5.JPG");
		  discoveryCenter1 = loadImage("discoveryCenter_1.JPG");
		  ecoScapes1 = loadImage("ecoScapes_1.JPG");
		  ecoScapes2 = loadImage("ecoScapes_2.JPG");
		  ecoScapes3 = loadImage("ecoScapes_3.JPG");
		  ecoScapes4= loadImage("ecoScapes_4.JPG");
		  ecoScapes5 = loadImage("ecoScapes_5.JPG");
		  ecoScapes6 = loadImage("ecoScapes_6.JPG");
		  ecoScapes7 = loadImage("ecoScapes_7.JPG");
		  ecoScapes8 = loadImage("ecoScapes_8.JPG");
		  everglades1 = loadImage("everglades_1.JPG");
		  everglades2 = loadImage("everglades_2.JPG");
		  gizmoCity1 = loadImage("gizmoCity_1.JPG");
		  goGreen1 = loadImage("goGreen_1.JPG");
		  goGreen2 = loadImage("goGreen_2.JPG");
		  goGreen3 = loadImage("goGreen_3.JPG");
		  otter1 = loadImage("otter_1.png");
		  otter2 = loadImage("otter_2.JPG");
		  powerfulYou1 = loadImage("powerfulYou_1.JPG");
		  powerfulYou2 = loadImage("powerfulYou_2.JPG");
		  powerfulYou3 = loadImage("powerfulYou_3.JPG");
		  powerfulYou4 = loadImage("powerfulYou_4.JPG");
		  powerfulYou5 = loadImage("powerfulYou_5.JPG");
		  powerfulYou6 = loadImage("powerfulYou_6.JPG");
		  powerfulYou7 = loadImage("powerfulYou_7.JPG");
		  prehistoric1 = loadImage("prehistoric_1.png");
		  prehistoric2 = loadImage("prehistoric_2.JPG");
		  stormCenter1 = loadImage("stormCenter_1.JPG");
		  stormCenter2 = loadImage("stormCenter_2.JPG");
		  stormCenter3 = loadImage("stormCenter_3.JPG");
		  stormCenter4 = loadImage("stormCenter_4.JPG");
		  stormCenter5 = loadImage("stormCenter_5.png");
		  stormCenter6 = loadImage("stormCenter_6.JPG");
		  waterStory1 = loadImage("waterStory_1.JPG");
		  waterStory2 = loadImage("waterStory_2.JPG");
		  waterStory3 = loadImage("waterStory_3.JPG");
		  waterStory4 = loadImage("waterStory_4.JPG");
		  waterStory5 = loadImage("waterStory_5.JPG");
		  waterStory6 = loadImage("waterStory_6.JPG");
		  waterStory7 = loadImage("waterStory_7.JPG");
		
    if(mapToggle == 1 && mouseY < 9*height/10) {
    	
    	if(mouseX > ((((1774-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2444-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {
    		mapToggle = 2;
    		mapWidth = width;
    		mapHeight = 9*height/10; 
    		mapX = mapWidth/2;
    		mapY = mapHeight/2;
    	}
    	
    	if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((450-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((856-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 5;
    	}
    	if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((866-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1206-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 11;
    	}
    	if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1222-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1566-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 7;
    	}
    	if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1580-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2040-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 2;
    	}
    	if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1134-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 4;
    	}
    	if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1258-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 4;
    	}
    	if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1370-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2090-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 4;
    	}
    	if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1130-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 12;
    	}
    	if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1258-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 12;
    	}
    	if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1368-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 12;
    	}
    	if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1522-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((332-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 10;
    	}
    	if(mouseX > ((((1534-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1754-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((414-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 8;
    	}
    }
    	
    	if(mapToggle == 2 && mouseY<9*height/10) {
    		
    		if(mouseX > ((((1748-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2416-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {

    			mapToggle = 1;
        		mapWidth = width;
        		mapHeight = 9*height/10; 
        		mapX = mapWidth/2;
        		mapY = mapHeight/2;
        		
        	}
    	
    	if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1752-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2502-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 1;
    	}
    	if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1350-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1744-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 6;
    	}
    	if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1284-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1150-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1828-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 9;
    	}
    	if(mouseX > ((((1392-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1716-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1310-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1542-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 3;
    	}
    	if(mouseX > ((((1298-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1696-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((340-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((734-1650)*height/3300)*zoomY)+mapY)) {
    		tagValue = 8;
    	}
    	}
    }
}

public void mouseDragged() {
	  if((mouseX-pmouseX) < 0) { //swipe to the left
	    if((mapX + mapWidth/2) > width) {
	      mapX += mouseX-pmouseX;
	    } 
	  } else { //swipe to the right
	    if((mapX-mapWidth/2) < 0) {
	      mapX += mouseX-pmouseX;
	    }
	  }
	  
	  if((mouseY-pmouseY) < 0) { //swipe up
	    if((mapY + mapHeight/2) > 9*height/10) {
	      mapY += mouseY-pmouseY;
	    }
	  } else { //swipe down
	    if(mapY-(mapHeight/2) < 0)  {
	      mapY += mouseY-pmouseY;
	    }
	 } 
	  
	}

public void onPinch(float x, float y, float d) {
	  mapWidth = constrain(mapWidth + 2 * d, width, 2*width);
	  mapHeight = constrain(mapHeight + 2 * (mapHeight/mapWidth) * d, 9*height/10, 2*9*height/10);
	  }
  

PendingIntent mPendingIntent; 

public void onCreate(Bundle savedInstanceState) {
  ketaiNFC = new KetaiNFC(this);
  super.onCreate(savedInstanceState);
  mPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, 
  getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0); 
}

public void onNewIntent(Intent intent) {
  if (ketaiNFC != null)
    ketaiNFC.handleIntent(intent); 
}

public void aviationStation() {
	background(255,247,114);
	switch(imageNumber) {
	case 1:
		image(aviationStation1, width/2, height/2);
		break;
	case 2:
		image(aviationStation2, width/2, height/2);
		break;
	case 3:
		image(aviationStation3, width/2, height/2);
		break;
	case 4:
		image(aviationStation4, width/2, height/2);
		break;
	case 5:
		image(aviationStation5, width/2, height/2);
	}
}
public void discoveryCenter() {
	background(255,247,114);

	image(discoveryCenter1, width/2, height/2);
}
public void discoveryLab() {
	background(255,247,114);
}
public void ecoScapes() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(ecoScapes1, width/2, height/2);
		break;
	case 2:
		image(ecoScapes2, width/2, height/2);
		break;
	case 3:
		image(ecoScapes3, width/2, height/2);
		break;
	case 4:
		image(ecoScapes4, width/2, height/2);
		break;
	case 5:
		image(ecoScapes5, width/2, height/2);
		break;
	case 6:
		image(ecoScapes6, width/2, height/2);
		break;
	case 7:
		image(ecoScapes7, width/2, height/2);
		break;
	case 8:
		image(ecoScapes8, width/2, height/2);
	}
}
public void everglades() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(everglades1, width/2, height/2);
		break;
	case 2:
		image(everglades2, width/2, height/2);
		break;
	}
}
public void exhibitsPage() {
	Intent i = new Intent(context, Schedule.class);
	startActivity(i);
}
public void gizmoCity() {
	background(255,247,114);

	image(gizmoCity1, width/2, height/2);
}
public void goGreen() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(goGreen1, width/2, height/2);
		break;
	case 2:
		image(goGreen2, width/2, height/2);
		break;
	case 3:
		image(goGreen3, width/2, height/2);
		break;
	}
}
public void homePage() {
  background(100);
}
public void mapPage() {
	background(255);
	pushMatrix();
	if(mapToggle == 1) {
		  image(mapFloor1, mapX, mapY, mapWidth, mapHeight);
		} else if(mapToggle == 2) {
		  image(mapFloor2, mapX, mapY, mapWidth, mapHeight); 
		}
	popMatrix();
}
public void otter() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(otter1, width/2, height/2);
		break;
	case 2:
		image(otter2, width/2, height/2);
		break;
	}
}
public void powerfulYou() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(powerfulYou1, width/2, height/2);
		break;
	case 2:
		image(powerfulYou2, width/2, height/2);
		break;
	case 3:
		image(powerfulYou3, width/2, height/2);
		break;
	case 4:
		image(powerfulYou4, width/2, height/2);
		break;
	case 5:
		image(powerfulYou5, width/2, height/2);
		break;
	case 6:
		image(powerfulYou6, width/2, height/2);
		break;
	case 7:
		image(powerfulYou7, width/2, height/2);
		break;
	}
}
public void prehistoric() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(prehistoric1, width/2, height/2);
		break;
	case 2:
		image(prehistoric2, width/2, height/2);
		break;
	}
}
public void stickersPage() {
  background(255,247,114);
  switch(stickerPageNumber) {
	case 1:
		image(stickerPrehistoricGray, width/2, height/3);
		image(stickerEvergladesGray, width/3, 2*height/3);
		image(stickerGoGreenGray, 2*width/3, 2*height/3);
		if(prehistoricBoolean == true) {
			image(stickerPrehistoric, width/2, height/3);
		}
		if(evergladesBoolean == true) {
			image(stickerEverglades, width/3, 2*height/3);
		}
		if(goGreenBoolean == true) {
			image(stickerGoGreen, 2*width/3, 2*height/3);
		}
		break;
	case 2:
		image(stickerOtterGray, width/2, height/3);
		image(stickerPowerfulYouGray, width/3, 2*height/3);
		image(stickerEcoScapesGray, 2*width/3, 2*height/3);
		if(otterBoolean == true) {
			image(stickerOtter, width/2, height/3);
		}
		if(powerfulYouBoolean == true) {
			image(stickerPowerfulYou, width/3, 2*height/3);
		}
		if(ecoScapesBoolean == true) {
			image(stickerEcoScapes, 2*width/3, 2*height/3);
		}
		break;
	case 3:
		image(stickerAviationStationGray, width/2, height/3);
		image(stickerStormCenterGray, width/3, 2*height/3);
		image(stickerWaterStoryGray, 2*width/3, 2*height/3);
		if(aviationStationBoolean == true) {
			image(stickerAviationStation, width/2, height/3);
		}
		if(stormCenterBoolean == true) {
			image(stickerStormCenter, width/3, 2*height/3);
		}
		if(waterStoryBoolean == true) {
			image(stickerWaterStory, 2*width/3, 2*height/3);
		}
		break;
		
	}
}
public void stormCenter() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(stormCenter1, width/2, height/2);
		break;
	case 2:
		image(stormCenter2, width/2, height/2);
		break;
	case 3:
		image(stormCenter3, width/2, height/2);
		break;
	case 4:
		image(stormCenter4, width/2, height/2);
		break;
	case 5:
		image(stormCenter5, width/2, height/2);
		break;
	case 6:
		image(stormCenter6, width/2, height/2);
		break;
	}
}
public void waterStory() {
	background(255,247,114);

	switch(imageNumber) {
	case 1:
		image(waterStory1, width/2, height/2);
		break;
	case 2:
		image(waterStory2, width/2, height/2);
		break;
	case 3:
		image(waterStory3, width/2, height/2);
		break;
	case 4:
		image(waterStory4, width/2, height/2);
		break;
	case 5:
		image(waterStory5, width/2, height/2);
		break;
	case 6:
		image(waterStory6, width/2, height/2);
		break;
	case 7:
		image(waterStory7, width/2, height/2);
		break;
	}
}
public void welcomeScreen() {
	background(100,50,50);

}


public boolean surfaceTouchEvent(MotionEvent event) {  //(20)
	  //call to keep mouseX and mouseY constants updated
	  super.surfaceTouchEvent(event);
	  //forward events
	  return gesture.surfaceTouchEvent(event);
	}



}


