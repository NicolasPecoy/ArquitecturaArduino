package com.mycompany.arduino;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class arduino {
    
    
        
        PanamaHitek_Arduino ins = new PanamaHitek_Arduino();
        SerialPortEventListener listen = new SerialPortEventListener() {
            @Override
            public void serialEvent(SerialPortEvent serialPortEvent) {
                //aca se guardan los datos en la matriz de arraylist 
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    public void main(String[] args) {
            try {
                ins.arduinoRX("Porn name", 0, listen);
            } catch (ArduinoException ex) {
                Logger.getLogger(arduino.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SerialPortException ex) {
                Logger.getLogger(arduino.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
