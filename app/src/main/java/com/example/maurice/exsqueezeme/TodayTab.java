package com.example.maurice.exsqueezeme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/**
 * Created by Maurice on 9/29/2016.
 */

public class TodayTab extends Fragment implements View.OnClickListener{

    TextView TV_currentGoal;
    TextView TV_currentRep;
    private OutputStream outputStream;
    private InputStream inStream;
    static final UUID UUID_1 =UUID.fromString("00001800-0000-1000-8000-00805f9b34fb");
    static final UUID UUID_2 =UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");
    static final UUID UUID_3 =UUID.fromString("fd5abba0-3935-11e5-85a6-0002a5d5c51b");

    int docGoal;
//    TodayTab tt = new TodayTab();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View todayView = inflater.inflate(R.layout.fragment_today, container, false);
        TextView TV_currentGoal = (TextView) todayView.findViewById(R.id.TV_currentGoal);
//        TV_currentGoal.setText(tt.getGoal());
//        TV_currentRep = (TextView) todayView.findViewById(R.id.currentRep);
        Button BTN_getMode = (Button) todayView.findViewById(R.id.BTN_getMode);
        Button BTN_counterMode = (Button) todayView.findViewById(R.id.BTN_counterMode);
        Button BTN_freeCountMode = (Button) todayView.findViewById(R.id.BTN_freeCountMode);
        return todayView;

    }



    public void onClick(View view)
    {
        //Send message to the device
        Button button = (Button) view;

        switch (view.getId())
        {
            case R.id.BTN_getMode:
//                String BTN_msg = "Gm";
//                byte[] b = BTN_msg.getBytes();
//
//                BluetoothLeService BLS = new BluetoothLeService();
//                BLS.writeCustomCharacteristic(b);

                try {
//                    BluetoothLeService BLS = new BluetoothLeService();
//                    BLS.writeCharacteristic("Gm");
                    MainActivity MA = new MainActivity();
                    MA.sendMessage();
//                    writeCharacteristic("Gm");
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case R.id.BTN_counterMode:
//                BLS = new BluetoothLeService();
//                BLS.writeCustomCharacteristic("Sm1");
                try {
                    BluetoothLeService BLS = new BluetoothLeService();
//                    DeviceControlActivity DCA = new DeviceControlActivity();
                    BLS.writeCharacteristic("Sm1");
//                    writeCharacteristic("Sm2");
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case R.id.BTN_freeCountMode:
//                BLS = new BluetoothLeService();
//                BLS.writeCustomCharacteristic("Sm1");
                try {
                    BluetoothLeService BLS = new BluetoothLeService();
//                    DeviceControlActivity DCA = new DeviceControlActivity();
                    BLS.writeCharacteristic("Sm2");
//                    writeCharacteristic("Sm1");
                }catch(Exception e){
                    e.printStackTrace();
                }

                break;
        }
    }


//    private void init() throws IOException {
//        BluetoothAdapter blueAdapter = BluetoothAdapter.getDefaultAdapter();
//        if (blueAdapter != null) {
//            if (blueAdapter.isEnabled()) {
//                Set<BluetoothDevice> bondedDevices = blueAdapter.getBondedDevices();
//
//                if(bondedDevices.size() > 0) {
//                    int position = 0;
//                    Object[] devices = (Object []) bondedDevices.toArray();
//                    BluetoothDevice device = (BluetoothDevice) devices[position];
//                    ParcelUuid[] uuids = device.getUuids();
//                    BluetoothSocket socket = device.createRfcommSocketToServiceRecord(uuids[0].getUuid());
//                    socket.connect();
//                    outputStream = socket.getOutputStream();
//                    Log.d(TAG, "outputSteam is : "+outputStream);
//                    inStream = socket.getInputStream();
//                }
//
//                Log.e("error", "No appropriate paired devices.");
//            } else {
//                Log.e("error", "Bluetooth is disabled.");
//            }
//        }
//    }

//    private void sendMessage(String msg) throws IOException
//    {
////        byte[] b = msg.getBytes();
////        outputStream.write(b);
////        BluetoothSocket mmSocket= null;
////        OutputStream mmOutStream = null;
//
////        try {
//////            BluetoothSocket mmSocket= null;
//////          outputStream = socket.getOutputStream();
////        } catch (IOException e) {}
//        BluetoothAdapter blueAdapter = BluetoothAdapter.getDefaultAdapter();
//        Set<BluetoothDevice> bondedDevices = blueAdapter.getBondedDevices();
//        int position = 0;
//        Object[] devices = (Object []) bondedDevices.toArray();
//        BluetoothDevice device = (BluetoothDevice) devices[position];
////        Log.d(TAG, "Device's are "+device);
////        ParcelUuid[] uuids = device.getUuids();
////        Log.d(TAG, "UUID's are "+uuids);
////        BluetoothSocket socket = device.createRfcommSocketToServiceRecord(UUID_3);
////        socket.connect();
//
//
//        BluetoothManager mBluetoothManager = (BluetoothManager) .getSystemService(Context.BLUETOOTH_SERVICE);
//        BluetoothAdapter mBluetoothAdapter = mBluetoothManager.getAdapter();
//
//        BluetoothSocket mSocket = null;
//        if(device.getBondState()==device.BOND_BONDED){
//            Log.d(TAG,device.getName());
//            //BluetoothSocket mSocket=null;
//            try {
//                mSocket = device.createInsecureRfcommSocketToServiceRecord(UUID_3);
//            } catch (IOException e1) {
//                // TODO Auto-generated catch block
//                Log.d(TAG,"socket not created");
//                e1.printStackTrace();
//            }
//            try{
//                mSocket.connect();
//            }
//            catch(IOException e){
//                try {
//                    mSocket.close();
//                    Log.d(TAG,"Cannot connect");
//                } catch (IOException e1) {
//                    Log.d(TAG,"Socket not closed");
//                    e1.printStackTrace();
//                }
//            }
//
//        outputStream = mSocket.getOutputStream();
////        msg = "Sm1";
//        byte[] msgBuffer = msg.getBytes(StandardCharsets.US_ASCII);
//
//        try {
//            Log.d(TAG, "outputSteam is : "+outputStream);
//            outputStream.write(msgBuffer);
//        } catch (IOException e) {}
//    }
//}

//    private final BluetoothGattCallback mGattCallback = new BluetoothGattCallback() {
//        @Override
//        public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
//            super.onCharacteristicWrite(gatt, characteristic, status);
//
//            gatt.connectGatt();
//        }
//    };
//
//public void writeCharacteristic(String msg) {
//        BluetoothGattCharacteristic msgToSend = new BluetoothGattCharacteristic(UUID_3,
//                BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE, BluetoothGattCharacteristic.PERMISSION_WRITE);
//        BluetoothGatt gatt1 = new BluetoothGatt();
//        msgToSend.setValue(msg);
//        msgToSend.setWriteType(BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT);
//        gatt1.writeCharacteristic(msgToSend);
//        return;
//        }


}
