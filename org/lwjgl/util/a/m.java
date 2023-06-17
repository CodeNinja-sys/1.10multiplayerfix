/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.k;

public class m
extends k {
    public void a(float f2, int n2, int n3) {
        boolean bl2 = this.d != 100002;
        float f3 = this.b == 100021 ? -1.0f : 1.0f;
        float f4 = (float)Math.PI / (float)n3;
        float f5 = (float)Math.PI * 2 / (float)n2;
        if (this.a == 100012) {
            float f6;
            float f7;
            int n4;
            int n5;
            float f8;
            float f9;
            float f10;
            float f11;
            int n6;
            if (!this.c) {
                GL11.c(6);
                GL11.b(0.0f, 0.0f, 1.0f);
                GL11.e(0.0f, 0.0f, f3 * f2);
                for (n6 = 0; n6 <= n2; ++n6) {
                    f11 = n6 == n2 ? 0.0f : (float)n6 * f5;
                    f10 = -this.a(f11) * this.a(f4);
                    f9 = this.b(f11) * this.a(f4);
                    f8 = f3 * this.b(f4);
                    if (bl2) {
                        GL11.b(f10 * f3, f9 * f3, f8 * f3);
                    }
                    GL11.e(f10 * f2, f9 * f2, f8 * f2);
                }
                GL11.a();
            }
            float f12 = 1.0f / (float)n2;
            float f13 = 1.0f / (float)n3;
            float f14 = 1.0f;
            if (this.c) {
                n5 = 0;
                n4 = n3;
            } else {
                n5 = 1;
                n4 = n3 - 1;
            }
            for (int i2 = n5; i2 < n4; ++i2) {
                f7 = (float)i2 * f4;
                GL11.c(8);
                f6 = 0.0f;
                for (n6 = 0; n6 <= n2; ++n6) {
                    f11 = n6 == n2 ? 0.0f : (float)n6 * f5;
                    f10 = -this.a(f11) * this.a(f7);
                    f9 = this.b(f11) * this.a(f7);
                    f8 = f3 * this.b(f7);
                    if (bl2) {
                        GL11.b(f10 * f3, f9 * f3, f8 * f3);
                    }
                    this.a(f6, f14);
                    GL11.e(f10 * f2, f9 * f2, f8 * f2);
                    f10 = -this.a(f11) * this.a(f7 + f4);
                    f9 = this.b(f11) * this.a(f7 + f4);
                    f8 = f3 * this.b(f7 + f4);
                    if (bl2) {
                        GL11.b(f10 * f3, f9 * f3, f8 * f3);
                    }
                    this.a(f6, f14 - f13);
                    f6 += f12;
                    GL11.e(f10 * f2, f9 * f2, f8 * f2);
                }
                GL11.a();
                f14 -= f13;
            }
            if (!this.c) {
                GL11.c(6);
                GL11.b(0.0f, 0.0f, -1.0f);
                GL11.e(0.0f, 0.0f, -f2 * f3);
                f7 = (float)Math.PI - f4;
                f6 = 1.0f;
                for (n6 = n2; n6 >= 0; --n6) {
                    f11 = n6 == n2 ? 0.0f : (float)n6 * f5;
                    f10 = -this.a(f11) * this.a(f7);
                    f9 = this.b(f11) * this.a(f7);
                    f8 = f3 * this.b(f7);
                    if (bl2) {
                        GL11.b(f10 * f3, f9 * f3, f8 * f3);
                    }
                    f6 -= f12;
                    GL11.e(f10 * f2, f9 * f2, f8 * f2);
                }
                GL11.a();
            }
        } else if (this.a == 100011 || this.a == 100013) {
            float f15;
            float f16;
            float f17;
            float f18;
            int n7;
            float f19;
            int n8;
            for (n8 = 1; n8 < n3; ++n8) {
                f19 = (float)n8 * f4;
                GL11.c(2);
                for (n7 = 0; n7 < n2; ++n7) {
                    f18 = (float)n7 * f5;
                    f17 = this.b(f18) * this.a(f19);
                    f16 = this.a(f18) * this.a(f19);
                    f15 = this.b(f19);
                    if (bl2) {
                        GL11.b(f17 * f3, f16 * f3, f15 * f3);
                    }
                    GL11.e(f17 * f2, f16 * f2, f15 * f2);
                }
                GL11.a();
            }
            for (n7 = 0; n7 < n2; ++n7) {
                f18 = (float)n7 * f5;
                GL11.c(3);
                for (n8 = 0; n8 <= n3; ++n8) {
                    f19 = (float)n8 * f4;
                    f17 = this.b(f18) * this.a(f19);
                    f16 = this.a(f18) * this.a(f19);
                    f15 = this.b(f19);
                    if (bl2) {
                        GL11.b(f17 * f3, f16 * f3, f15 * f3);
                    }
                    GL11.e(f17 * f2, f16 * f2, f15 * f2);
                }
                GL11.a();
            }
        } else if (this.a == 100010) {
            GL11.c(0);
            if (bl2) {
                GL11.b(0.0f, 0.0f, f3);
            }
            GL11.e(0.0f, 0.0f, f2);
            if (bl2) {
                GL11.b(0.0f, 0.0f, -f3);
            }
            GL11.e(0.0f, 0.0f, -f2);
            for (int i3 = 1; i3 < n3 - 1; ++i3) {
                float f20 = (float)i3 * f4;
                for (int i4 = 0; i4 < n2; ++i4) {
                    float f21 = (float)i4 * f5;
                    float f22 = this.b(f21) * this.a(f20);
                    float f23 = this.a(f21) * this.a(f20);
                    float f24 = this.b(f20);
                    if (bl2) {
                        GL11.b(f22 * f3, f23 * f3, f24 * f3);
                    }
                    GL11.e(f22 * f2, f23 * f2, f24 * f2);
                }
            }
            GL11.a();
        }
    }
}

