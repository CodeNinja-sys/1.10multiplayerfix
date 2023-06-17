/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.k;

public class h
extends k {
    private static final int e = 240;

    public void a(float f2, float f3, int n2, int n3, float f4, float f5) {
        int n4;
        float[] arrf = new float[240];
        float[] arrf2 = new float[240];
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (n2 >= 240) {
            n2 = 239;
        }
        if (n2 < 2 || n3 < 1 || f3 <= 0.0f || f2 < 0.0f || f2 > f3) {
            System.err.println("PartialDisk: GLU_INVALID_VALUE");
            return;
        }
        if (f5 < -360.0f) {
            f5 = 360.0f;
        }
        if (f5 > 360.0f) {
            f5 = 360.0f;
        }
        if (f5 < 0.0f) {
            f4 += f5;
            f5 = -f5;
        }
        int n5 = f5 == 360.0f ? n2 : n2 + 1;
        float f8 = f3 - f2;
        float f9 = f4 / 180.0f * (float)Math.PI;
        for (n4 = 0; n4 <= n2; ++n4) {
            float f10 = f9 + (float)Math.PI * f5 / 180.0f * (float)n4 / (float)n2;
            arrf[n4] = this.a(f10);
            arrf2[n4] = this.b(f10);
        }
        if (f5 == 360.0f) {
            arrf[n2] = arrf[0];
            arrf2[n2] = arrf2[0];
        }
        switch (this.d) {
            case 100000: 
            case 100001: {
                if (this.b == 100020) {
                    GL11.b(0.0f, 0.0f, 1.0f);
                    break;
                }
                GL11.b(0.0f, 0.0f, -1.0f);
                break;
            }
        }
        block3 : switch (this.a) {
            case 100012: {
                float f11;
                int n6;
                if (f2 == 0.0f) {
                    n6 = n3 - 1;
                    GL11.c(6);
                    if (this.c) {
                        GL11.f(0.5f, 0.5f);
                    }
                    GL11.e(0.0f, 0.0f, 0.0f);
                    f11 = f3 - f8 * ((float)(n3 - 1) / (float)n3);
                    if (this.c) {
                        f6 = f11 / f3 / 2.0f;
                    }
                    if (this.b == 100020) {
                        for (n4 = n2; n4 >= 0; --n4) {
                            if (this.c) {
                                GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                            }
                            GL11.e(f11 * arrf[n4], f11 * arrf2[n4], 0.0f);
                        }
                    } else {
                        for (n4 = 0; n4 <= n2; ++n4) {
                            if (this.c) {
                                GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                            }
                            GL11.e(f11 * arrf[n4], f11 * arrf2[n4], 0.0f);
                        }
                    }
                    GL11.a();
                } else {
                    n6 = n3;
                }
                for (int i2 = 0; i2 < n6; ++i2) {
                    f11 = f3 - f8 * ((float)i2 / (float)n3);
                    float f12 = f3 - f8 * ((float)(i2 + 1) / (float)n3);
                    if (this.c) {
                        f6 = f11 / f3 / 2.0f;
                        f7 = f12 / f3 / 2.0f;
                    }
                    GL11.c(8);
                    for (n4 = 0; n4 <= n2; ++n4) {
                        if (this.b == 100020) {
                            if (this.c) {
                                GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                            }
                            GL11.e(f11 * arrf[n4], f11 * arrf2[n4], 0.0f);
                            if (this.c) {
                                GL11.f(f7 * arrf[n4] + 0.5f, f7 * arrf2[n4] + 0.5f);
                            }
                            GL11.e(f12 * arrf[n4], f12 * arrf2[n4], 0.0f);
                            continue;
                        }
                        if (this.c) {
                            GL11.f(f7 * arrf[n4] + 0.5f, f7 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f12 * arrf[n4], f12 * arrf2[n4], 0.0f);
                        if (this.c) {
                            GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f11 * arrf[n4], f11 * arrf2[n4], 0.0f);
                    }
                    GL11.a();
                }
                break;
            }
            case 100010: {
                GL11.c(0);
                for (n4 = 0; n4 < n5; ++n4) {
                    float f13 = arrf[n4];
                    float f14 = arrf2[n4];
                    for (int i3 = 0; i3 <= n3; ++i3) {
                        float f15 = f3 - f8 * ((float)i3 / (float)n3);
                        if (this.c) {
                            f6 = f15 / f3 / 2.0f;
                            GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f15 * f13, f15 * f14, 0.0f);
                    }
                }
                GL11.a();
                break;
            }
            case 100011: {
                float f16;
                int n7;
                if (f2 == f3) {
                    GL11.c(3);
                    for (n4 = 0; n4 <= n2; ++n4) {
                        if (this.c) {
                            GL11.f(arrf[n4] / 2.0f + 0.5f, arrf2[n4] / 2.0f + 0.5f);
                        }
                        GL11.e(f2 * arrf[n4], f2 * arrf2[n4], 0.0f);
                    }
                    GL11.a();
                    break;
                }
                for (n7 = 0; n7 <= n3; ++n7) {
                    f16 = f3 - f8 * ((float)n7 / (float)n3);
                    if (this.c) {
                        f6 = f16 / f3 / 2.0f;
                    }
                    GL11.c(3);
                    for (n4 = 0; n4 <= n2; ++n4) {
                        if (this.c) {
                            GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f16 * arrf[n4], f16 * arrf2[n4], 0.0f);
                    }
                    GL11.a();
                }
                for (n4 = 0; n4 < n5; ++n4) {
                    float f17 = arrf[n4];
                    float f18 = arrf2[n4];
                    GL11.c(3);
                    for (n7 = 0; n7 <= n3; ++n7) {
                        f16 = f3 - f8 * ((float)n7 / (float)n3);
                        if (this.c) {
                            f6 = f16 / f3 / 2.0f;
                        }
                        if (this.c) {
                            GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f16 * f17, f16 * f18, 0.0f);
                    }
                    GL11.a();
                }
                break;
            }
            case 100013: {
                float f19;
                int n8;
                if (f5 < 360.0f) {
                    for (n4 = 0; n4 <= n2; n4 += n2) {
                        float f20 = arrf[n4];
                        float f21 = arrf2[n4];
                        GL11.c(3);
                        for (n8 = 0; n8 <= n3; ++n8) {
                            f19 = f3 - f8 * ((float)n8 / (float)n3);
                            if (this.c) {
                                f6 = f19 / f3 / 2.0f;
                                GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                            }
                            GL11.e(f19 * f20, f19 * f21, 0.0f);
                        }
                        GL11.a();
                    }
                }
                for (n8 = 0; n8 <= n3; n8 += n3) {
                    f19 = f3 - f8 * ((float)n8 / (float)n3);
                    if (this.c) {
                        f6 = f19 / f3 / 2.0f;
                    }
                    GL11.c(3);
                    for (n4 = 0; n4 <= n2; ++n4) {
                        if (this.c) {
                            GL11.f(f6 * arrf[n4] + 0.5f, f6 * arrf2[n4] + 0.5f);
                        }
                        GL11.e(f19 * arrf[n4], f19 * arrf2[n4], 0.0f);
                    }
                    GL11.a();
                    if (f2 == f3) break block3;
                }
                break;
            }
        }
    }
}

