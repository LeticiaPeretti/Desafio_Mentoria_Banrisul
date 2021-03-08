package Utilitarios;

import java.time.Duration;

import org.openqa.selenium.support.ui.Sleeper;

public class EsperaFixa {
	
    public static void esperaEmSegundosSleeper(int timeout){
        try {
            Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(timeout));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void aguardaEmSegundos(int timeout){
        try {
            Thread.sleep(timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

	

    
