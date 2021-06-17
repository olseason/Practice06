package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if("앱".equals(str)){
           app();
        }else{
            super.execute(str);
        }
        
    }
    
    
    
    public void app() {
    	System.out.println("앱실행");
    }
    
    protected void playMusic(){
        System.out.println("다운로드에서 음악재생");
    }
    
      
}
