package com.example.map_test;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class accelerometer {
    private double x,y, z, svm;
    private SensorManager sensorManager;
    private RFModel model;
    private Acc acc;

    public void onAccuracyChanged(Sensor arg0, int arg1) {
    }

    public void onSensorChanged(SensorEvent event) {
        double x = 0, y = 0, z = 0;
        model = new RFModel();
        if (event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            x = event.values[0];
            y = event.values[1];
            z = event.values[2];
            acc = new Acc(x, y, z);
            model.setSvm(acc);

        }

    }

}
