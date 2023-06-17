/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.k;

public class b
extends k {
    public void a(float f2, float f3, int n2, int n3) {
        if (this.d != 100002) {
            if (this.b == 100020) {
                GL11.b(0.0f, 0.0f, 1.0f);
            } else {
                GL11.b(0.0f, 0.0f, -1.0f);
            }
        }
        float f4 = (float)Math.PI * 2 / (float)n2;
        float f5 = (f3 - f2) / (float)n3;
        switch (this.a) {
            case 100012: {
                float f6 = 2.0f * f3;
                float f7 = f2;
                for (int i2 = 0; i2 < n3; ++i2) {
                    float f8;
                    float f9;
                    float f10;
                    int n4;
                    float f11 = f7 + f5;
                    if (this.b == 100020) {
                        GL11.c(8);
                        for (n4 = 0; n4 <= n2; ++n4) {
                            f10 = n4 == n2 ? 0.0f : (float)n4 * f4;
                            f9 = this.a(f10);
                            f8 = this.b(f10);
                            this.a(0.5f + f9 * f11 / f6, 0.5f + f8 * f11 / f6);
                            GL11.e(f11 * f9, f11 * f8);
                            this.a(0.5f + f9 * f7 / f6, 0.5f + f8 * f7 / f6);
                            GL11.e(f7 * f9, f7 * f8);
                        }
                        GL11.a();
                    } else {
                        GL11.c(8);
                        for (n4 = n2; n4 >= 0; --n4) {
                            f10 = n4 == n2 ? 0.0f : (float)n4 * f4;
                            f9 = this.a(f10);
                            f8 = this.b(f10);
                            this.a(0.5f - f9 * f11 / f6, 0.5f + f8 * f11 / f6);
                            GL11.e(f11 * f9, f11 * f8);
                            this.a(0.5f - f9 * f7 / f6, 0.5f + f8 * f7 / f6);
                            GL11.e(f7 * f9, f7 * f8);
                        }
                        GL11.a();
                    }
                    f7 = f11;
                }
                break;
            }
            case 100011: {
                float f12;
                int n5;
                float f13;
                int n6;
                for (n6 = 0; n6 <= n3; ++n6) {
                    f13 = f2 + (float)n6 * f5;
                    GL11.c(2);
                    for (n5 = 0; n5 < n2; ++n5) {
                        f12 = (float)n5 * f4;
                        GL11.e(f13 * this.a(f12), f13 * this.b(f12));
                    }
                    GL11.a();
                }
                for (n5 = 0; n5 < n2; ++n5) {
                    f13 = (float)n5 * f4;
                    f12 = this.a(f13);
                    float f14 = this.b(f13);
                    GL11.c(3);
                    for (n6 = 0; n6 <= n3; ++n6) {
                        float f15 = f2 + (float)n6 * f5;
                        GL11.e(f15 * f12, f15 * f14);
                    }
                    GL11.a();
                }
                break;
            }
            case 100010: {
                GL11.c(0);
                for (int i3 = 0; i3 < n2; ++i3) {
                    float f16 = (float)i3 * f4;
                    float f17 = this.a(f16);
                    float f18 = this.b(f16);
                    for (int i4 = 0; i4 <= n3; ++i4) {
                        float f19 = f2 * (float)i4 * f5;
                        GL11.e(f19 * f17, f19 * f18);
                    }
                }
                GL11.a();
                break;
            }
            case 100013: {
                float f20;
                float f21;
                float f22;
                if ((double)f2 != 0.0) {
                    GL11.c(2);
                    f22 = 0.0f;
                    while ((double)f22 < 6.2831854820251465) {
                        f21 = f2 * this.a(f22);
                        f20 = f2 * this.b(f22);
                        GL11.e(f21, f20);
                        f22 += f4;
                    }
                    GL11.a();
                }
                GL11.c(2);
                for (f22 = 0.0f; f22 < (float)Math.PI * 2; f22 += f4) {
                    f21 = f3 * this.a(f22);
                    f20 = f3 * this.b(f22);
                    GL11.e(f21, f20);
                }
                GL11.a();
                break;
            }
            default: {
                return;
            }
        }
    }
}

