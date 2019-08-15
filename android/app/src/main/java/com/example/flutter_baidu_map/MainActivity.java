package com.example.flutter_baidu_map;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import com.baidu.mapapi.map.TextureMapView;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextureMapView TMap = new TextureMapView(this);
    ViewRegistrant.registerWith(this, TMap);
  }
}
