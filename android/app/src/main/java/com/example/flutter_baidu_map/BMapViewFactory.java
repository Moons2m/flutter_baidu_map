package com.example.flutter_baidu_map;

import android.content.Context;
import android.view.View;

import com.baidu.mapapi.map.TextureMapView;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
public class BMapViewFactory extends PlatformViewFactory {

    private TextureMapView TMap;

    public BMapViewFactory(MessageCodec<Object> createArgsCodec, TextureMapView TMap) {
        super(createArgsCodec);
        this.TMap = TMap;
    }

    @Override
    public PlatformView create(final Context context, int i, Object o) {
        return new PlatformView() {
            @Override
            public View getView() {
                return TMap;
            }

            @Override
            public void dispose() {

            }
        };
    }
}