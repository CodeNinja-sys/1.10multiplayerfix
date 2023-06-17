/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import java.util.Arrays;
import net.minecraft.client.main.Main;

public class Start {
    public static void main(String[] arrstring) {
        Main.main((String[])Start.a(new String[]{"--version", "1.10 Multiplayer Fix", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.8", "--userProperties", "{}"}, arrstring));
    }

    public static Object[] a(Object[] arrobject, Object[] arrobject2) {
        Object[] arrobject3 = Arrays.copyOf(arrobject, arrobject.length + arrobject2.length);
        System.arraycopy(arrobject2, 0, arrobject3, arrobject.length, arrobject2.length);
        return arrobject3;
    }
}

