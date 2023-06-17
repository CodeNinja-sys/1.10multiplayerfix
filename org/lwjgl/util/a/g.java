/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.i;
import org.lwjgl.util.a.n;

public class g
extends n {
    public static int a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int n8;
        if (n4 < 1 || n5 < 1) {
            return 100901;
        }
        int n9 = g.b(n6, n7);
        if (n9 == 0) {
            return 100900;
        }
        int n10 = g.d(3379);
        int n11 = g.c(n4);
        if (n11 > n10) {
            n11 = n10;
        }
        if ((n8 = g.c(n5)) > n10) {
            n8 = n10;
        }
        i i2 = new i();
        GL11.r(3330, 0);
        GL11.r(3333, 1);
        GL11.r(3331, 0);
        GL11.r(3332, 0);
        int n12 = 0;
        boolean bl2 = false;
        if (n11 != n4 || n8 != n5) {
            byteBuffer2 = BufferUtils.a((n11 + 4) * n8 * n9);
            int n13 = g.a(n6, n4, n5, n7, byteBuffer, n11, n8, n7, byteBuffer2);
            if (n13 != 0) {
                n12 = n13;
                bl2 = true;
            }
            GL11.r(3314, 0);
            GL11.r(3317, 1);
            GL11.r(3315, 0);
            GL11.r(3316, 0);
        } else {
            byteBuffer2 = byteBuffer;
        }
        ByteBuffer byteBuffer3 = null;
        ByteBuffer byteBuffer4 = null;
        int n14 = 0;
        while (!bl2) {
            int n15;
            if (byteBuffer2 != byteBuffer) {
                GL11.r(3314, 0);
                GL11.r(3317, 1);
                GL11.r(3315, 0);
                GL11.r(3316, 0);
            }
            GL11.a(n2, n14, n3, n11, n8, 0, n6, n7, byteBuffer2);
            if (n11 == 1 && n8 == 1) break;
            int n16 = n11 < 2 ? 1 : n11 >> 1;
            int n17 = n15 = n8 < 2 ? 1 : n8 >> 1;
            ByteBuffer byteBuffer5 = byteBuffer3 == null ? (byteBuffer3 = BufferUtils.a((n16 + 4) * n15 * n9)) : (byteBuffer4 == null ? (byteBuffer4 = BufferUtils.a((n16 + 4) * n15 * n9)) : byteBuffer4);
            int n18 = g.a(n6, n11, n8, n7, byteBuffer2, n16, n15, n7, byteBuffer5);
            if (n18 != 0) {
                n12 = n18;
                bl2 = true;
            }
            byteBuffer2 = byteBuffer5;
            if (byteBuffer4 != null) {
                byteBuffer4 = byteBuffer3;
            }
            n11 = n16;
            n8 = n15;
            ++n14;
        }
        i2.b();
        return n12;
    }

    public static int a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer, int n6, int n7, int n8, ByteBuffer byteBuffer2) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15 = g.b(n2);
        if (n15 == -1) {
            return 100900;
        }
        float[] arrf = new float[n3 * n4 * n15];
        float[] arrf2 = new float[n6 * n7 * n15];
        switch (n5) {
            case 5121: {
                n14 = 1;
                break;
            }
            case 5126: {
                n14 = 4;
                break;
            }
            default: {
                return 1280;
            }
        }
        switch (n8) {
            case 5121: {
                n13 = 1;
                break;
            }
            case 5126: {
                n13 = 4;
                break;
            }
            default: {
                return 1280;
            }
        }
        i i2 = new i();
        int n16 = i2.a > 0 ? i2.a : n3;
        int n17 = n14 >= i2.b ? n15 * n16 : i2.b / n14 * g.a(n15 * n16 * n14, i2.b);
        switch (n5) {
            case 5121: {
                int n18;
                n12 = 0;
                byteBuffer.rewind();
                for (n11 = 0; n11 < n4; ++n11) {
                    n18 = n11 * n17 + i2.c * n17 + i2.d * n15;
                    for (n10 = 0; n10 < n3 * n15; ++n10) {
                        arrf[n12++] = byteBuffer.get(n18++) & 0xFF;
                    }
                }
                break;
            }
            case 5126: {
                int n18;
                n12 = 0;
                byteBuffer.rewind();
                for (n11 = 0; n11 < n4; ++n11) {
                    n18 = 4 * (n11 * n17 + i2.c * n17 + i2.d * n15);
                    for (n10 = 0; n10 < n3 * n15; ++n10) {
                        arrf[n12++] = byteBuffer.getFloat(n18);
                        n18 += 4;
                    }
                }
                break;
            }
            default: {
                return 100900;
            }
        }
        float f2 = (float)n3 / (float)n6;
        float f3 = (float)n4 / (float)n7;
        float[] arrf3 = new float[n15];
        for (n9 = 0; n9 < n7; ++n9) {
            for (int i3 = 0; i3 < n6; ++i3) {
                int n19;
                int n20;
                int n21 = (int)((float)i3 * f2);
                int n22 = (int)((float)(i3 + 1) * f2);
                int n23 = (int)((float)n9 * f3);
                int n24 = (int)((float)(n9 + 1) * f3);
                int n25 = 0;
                for (n20 = 0; n20 < n15; ++n20) {
                    arrf3[n20] = 0.0f;
                }
                for (n20 = n21; n20 < n22; ++n20) {
                    for (int i4 = n23; i4 < n24; ++i4) {
                        n19 = (i4 * n3 + n20) * n15;
                        for (int i5 = 0; i5 < n15; ++i5) {
                            int n26 = i5;
                            arrf3[n26] = arrf3[n26] + arrf[n19 + i5];
                        }
                        ++n25;
                    }
                }
                int n27 = (n9 * n6 + i3) * n15;
                if (n25 == 0) {
                    n19 = (n23 * n3 + n21) * n15;
                    for (n20 = 0; n20 < n15; ++n20) {
                        arrf2[n27++] = arrf[n19 + n20];
                    }
                    continue;
                }
                for (n12 = 0; n12 < n15; ++n12) {
                    arrf2[n27++] = arrf3[n12] / (float)n25;
                }
            }
        }
        n16 = i2.e > 0 ? i2.e : n6;
        n17 = n13 >= i2.f ? n15 * n16 : i2.f / n13 * g.a(n15 * n16 * n13, i2.f);
        switch (n8) {
            case 5121: {
                n12 = 0;
                for (n11 = 0; n11 < n7; ++n11) {
                    n9 = n11 * n17 + i2.g * n17 + i2.h * n15;
                    for (n10 = 0; n10 < n6 * n15; ++n10) {
                        byteBuffer2.put(n9++, (byte)arrf2[n12++]);
                    }
                }
                break;
            }
            case 5126: {
                n12 = 0;
                for (n11 = 0; n11 < n7; ++n11) {
                    n9 = 4 * (n11 * n17 + i2.c * n17 + i2.d * n15);
                    for (n10 = 0; n10 < n6 * n15; ++n10) {
                        byteBuffer2.putFloat(n9, arrf2[n12++]);
                        n9 += 4;
                    }
                }
                break;
            }
            default: {
                return 100900;
            }
        }
        return 0;
    }
}

