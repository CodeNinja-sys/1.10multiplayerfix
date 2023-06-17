/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.util.ArrayList;
import java.util.Arrays;
import org.lwjgl.d;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.dx;
import org.lwjgl.util.e;

public final class c {
    private static final boolean b = false;

    public static DisplayMode[] a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        DisplayMode[] arrdisplayMode = dx.b();
        if (d.i) {
            System.out.println("Available screen modes:");
            for (DisplayMode displayMode : arrdisplayMode) {
                System.out.println(displayMode);
            }
        }
        ArrayList arrayList = new ArrayList(arrdisplayMode.length);
        for (int i2 = 0; i2 < arrdisplayMode.length; ++i2) {
            assert (arrdisplayMode[i2] != null) : "" + i2 + " " + arrdisplayMode.length;
            if (n2 != -1 && arrdisplayMode[i2].b() < n2 || n4 != -1 && arrdisplayMode[i2].b() > n4 || n3 != -1 && arrdisplayMode[i2].c() < n3 || n5 != -1 && arrdisplayMode[i2].c() > n5 || n6 != -1 && arrdisplayMode[i2].d() < n6 || n7 != -1 && arrdisplayMode[i2].d() > n7 || arrdisplayMode[i2].e() != 0 && (n8 != -1 && arrdisplayMode[i2].e() < n8 || n9 != -1 && arrdisplayMode[i2].e() > n9)) continue;
            arrayList.add(arrdisplayMode[i2]);
        }
        DisplayMode[] arrdisplayMode2 = new DisplayMode[arrayList.size()];
        arrayList.toArray(arrdisplayMode2);
        if (d.i) {
            // empty if block
        }
        return arrdisplayMode2;
    }

    public static DisplayMode a(DisplayMode[] arrdisplayMode, String[] arrstring) {
        Arrays.sort(arrdisplayMode, new e(arrstring));
        if (d.i) {
            System.out.println("Sorted display modes:");
            for (DisplayMode displayMode : arrdisplayMode) {
                System.out.println(displayMode);
            }
        }
        for (DisplayMode displayMode : arrdisplayMode) {
            try {
                if (d.i) {
                    System.out.println("Attempting to set displaymode: " + displayMode);
                }
                dx.a(displayMode);
                return displayMode;
            }
            catch (Exception exception) {
                if (!d.i) continue;
                System.out.println("Failed to set display mode to " + displayMode);
                exception.printStackTrace();
            }
        }
        throw new Exception("Failed to set display mode.");
    }
}

