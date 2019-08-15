package com.example.flutter_baidu_map;

import com.baidu.mapapi.map.TextureMapView;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.StandardMessageCodec;

public final class ViewRegistrant {
    public static void registerWith(PluginRegistry registry, TextureMapView TMap) {
        final String key = ViewRegistrant.class.getCanonicalName();

        if (registry.hasPlugin(key)) return;

        PluginRegistry.Registrar registrar = registry.registrarFor(key);
        registrar.platformViewRegistry().registerViewFactory("TMap", new BMapViewFactory(new StandardMessageCodec(), TMap));
    }
}