/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ay;
import com.ibm.icu.d.b;
import java.nio.ByteBuffer;

abstract class bm
extends ay {
    protected static b a = new b(16);
    protected static byte[] b = new byte[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 66, 67, 68, 69, 70, 71, 72, 73, 64, 64, 64, 64, 64, 64, 64, 81, 82, 64, 64, 85, 86, 87, 88, 89, 64, 64, 64, 64, 64, 64, 64, 64, 98, 99, 100, 101, 102, 103, 104, 105, 64, 64, 64, 64, 64, 64, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 64, 64, 64, 64, 64, 64, -128, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, 64, -94, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -83, -82, -81, -80, -79, -78, -77, -76, -75, 64, 64, -72, -71, -70, -69, -68, -67, -66, -65, 64, -127, -126, -125, -124, -123, -122, -121, -120, -119, 64, -53, 64, -51, 64, -49, 64, -111, -110, -109, -108, -107, -106, -105, -104, -103, -38, -37, -36, -35, -34, -33, 64, 64, -94, -93, -92, -91, -90, -89, -88, -87, -22, -21, 64, -19, -18, -17, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, -5, -4, -3, -2, 64};
    protected static byte[] c = new byte[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 66, 66, 68, 69, 70, 71, 71, 73, 74, 75, 76, 77, 78, 79, 80, 73, 82, 83, 84, 85, 86, 86, 88, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 99, 101, 101, 103, 103, 105, 106, 107, 108, 109, 110, 111, 105, 113, 113, 115, 116, 117, 118, 119, 119, 121, 122, 123, 124, 125, 126, 127, -128, -127, -126, -125, -124, -123, -122, -121, -120, -119, -128, -117, -117, -115, -115, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -102, -102, -102, -98, -98, -98, -95, -94, -93, -92, -91, -90, -89, -88, -87, -98, -85, -85, -83, -83, -81, -81, -79, -78, -77, -76, -75, -74, -73, -72, -71, -79, -69, -69, -67, -67, -65, -64, -63, -62, -61, -60, -59, -58, -57, -56, -55, -54, -65, -52, -65, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -38, -36, -36, -36, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};

    bm() {
    }

    public String b() {
        return "ar";
    }

    byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = this.b(arrby, n2);
        for (int i2 = 0; i2 < arrby2.length; ++i2) {
            arrby2[i2] = c[arrby2[i2] & 0xFF];
        }
        return arrby2;
    }

    private byte[] b(byte[] arrby, int n2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(n2 * 2);
        byte[] arrby2 = new byte[]{-79, 86};
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.a(arrby[i2])) {
                byteBuffer.put(arrby2);
                continue;
            }
            byteBuffer.put(arrby[i2]);
        }
        byte[] arrby3 = new byte[byteBuffer.position()];
        byteBuffer.position(0);
        byteBuffer.get(arrby3);
        return arrby3;
    }

    private boolean a(byte by2) {
        byte[] arrby = new byte[]{-78, -77, -76, -75, -73, -72};
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (by2 != arrby[i2]) continue;
            return true;
        }
        return false;
    }
}

