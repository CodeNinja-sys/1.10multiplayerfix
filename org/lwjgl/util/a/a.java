/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.k;

public class a
extends k {
    public void a(float f2, float f3, float f4, int n2, int n3) {
        float f5 = this.b == 100021 ? -1.0f : 1.0f;
        float f6 = (float)Math.PI * 2 / (float)n2;
        float f7 = (f3 - f2) / (float)n3;
        float f8 = f4 / (float)n3;
        float f9 = (f2 - f3) / f4;
        if (this.a == 100010) {
            GL11.c(0);
            for (int i2 = 0; i2 < n2; ++i2) {
                float f10 = this.b((float)i2 * f6);
                float f11 = this.a((float)i2 * f6);
                this.a(f10 * f5, f11 * f5, f9 * f5);
                float f12 = 0.0f;
                float f13 = f2;
                for (int i3 = 0; i3 <= n3; ++i3) {
                    GL11.e(f10 * f13, f11 * f13, f12);
                    f12 += f8;
                    f13 += f7;
                }
            }
            GL11.a();
        } else if (this.a == 100011 || this.a == 100013) {
            float f14;
            float f15;
            int n4;
            if (this.a == 100011) {
                float f16 = 0.0f;
                float f17 = f2;
                for (int i4 = 0; i4 <= n3; ++i4) {
                    GL11.c(2);
                    for (n4 = 0; n4 < n2; ++n4) {
                        f15 = this.b((float)n4 * f6);
                        f14 = this.a((float)n4 * f6);
                        this.a(f15 * f5, f14 * f5, f9 * f5);
                        GL11.e(f15 * f17, f14 * f17, f16);
                    }
                    GL11.a();
                    f16 += f8;
                    f17 += f7;
                }
            } else if ((double)f2 != 0.0) {
                GL11.c(2);
                for (n4 = 0; n4 < n2; ++n4) {
                    f15 = this.b((float)n4 * f6);
                    f14 = this.a((float)n4 * f6);
                    this.a(f15 * f5, f14 * f5, f9 * f5);
                    GL11.e(f15 * f2, f14 * f2, 0.0f);
                }
                GL11.a();
                GL11.c(2);
                for (n4 = 0; n4 < n2; ++n4) {
                    f15 = this.b((float)n4 * f6);
                    f14 = this.a((float)n4 * f6);
                    this.a(f15 * f5, f14 * f5, f9 * f5);
                    GL11.e(f15 * f3, f14 * f3, f4);
                }
                GL11.a();
            }
            GL11.c(1);
            for (n4 = 0; n4 < n2; ++n4) {
                f15 = this.b((float)n4 * f6);
                f14 = this.a((float)n4 * f6);
                this.a(f15 * f5, f14 * f5, f9 * f5);
                GL11.e(f15 * f2, f14 * f2, 0.0f);
                GL11.e(f15 * f3, f14 * f3, f4);
            }
            GL11.a();
        } else if (this.a == 100012) {
            float f18 = 1.0f / (float)n2;
            float f19 = 1.0f / (float)n3;
            float f20 = 0.0f;
            float f21 = 0.0f;
            float f22 = f2;
            for (int i5 = 0; i5 < n3; ++i5) {
                float f23 = 0.0f;
                GL11.c(8);
                for (int i6 = 0; i6 <= n2; ++i6) {
                    float f24;
                    float f25;
                    if (i6 == n2) {
                        f25 = this.a(0.0f);
                        f24 = this.b(0.0f);
                    } else {
                        f25 = this.a((float)i6 * f6);
                        f24 = this.b((float)i6 * f6);
                    }
                    if (f5 == 1.0f) {
                        this.a(f25 * f5, f24 * f5, f9 * f5);
                        this.a(f23, f20);
                        GL11.e(f25 * f22, f24 * f22, f21);
                        this.a(f25 * f5, f24 * f5, f9 * f5);
                        this.a(f23, f20 + f19);
                        GL11.e(f25 * (f22 + f7), f24 * (f22 + f7), f21 + f8);
                    } else {
                        this.a(f25 * f5, f24 * f5, f9 * f5);
                        this.a(f23, f20);
                        GL11.e(f25 * f22, f24 * f22, f21);
                        this.a(f25 * f5, f24 * f5, f9 * f5);
                        this.a(f23, f20 + f19);
                        GL11.e(f25 * (f22 + f7), f24 * (f22 + f7), f21 + f8);
                    }
                    f23 += f18;
                }
                GL11.a();
                f22 += f7;
                f20 += f19;
                f21 += f8;
            }
        }
    }
}

