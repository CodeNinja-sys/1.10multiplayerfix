/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.g;
import net.minecraft.client.g.a.p;
import net.minecraft.m.cd;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class a
extends g {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bp b;
    private final List h;
    private final List i;

    public a(bp bp2, List list, List list2) {
        this.b = bp2;
        this.h = list;
        this.i = list2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(s var1_1) {
        this.f();
        var2_2 = null;
        try {
            var2_2 = var1_1.a(this.b);
            var4_3 = p.a(var2_2.b());
            var5_5 = var4_3.getType();
            if (var5_5 == 0) {
                var5_5 = 6;
            }
            var3_6 = new BufferedImage(var4_3.getWidth(), var4_3.getHeight(), var5_5);
            var6_7 = var3_6.getGraphics();
            var6_7.drawImage(var4_3, 0, 0, null);
            var7_8 = 0;
            while (true) {
                block12: {
                    if (var7_8 >= 17 || var7_8 >= this.h.size() || var7_8 >= this.i.size()) ** GOTO lbl24
                    var8_9 = null;
                    try {
                        var9_10 = (String)this.h.get(var7_8);
                        var10_11 = ((cd)this.i.get(var7_8)).e();
                        if (var9_10 == null || (var11_12 = p.a((var8_9 = var1_1.a(new bp(var9_10))).b())).getWidth() != var3_6.getWidth() || var11_12.getHeight() != var3_6.getHeight() || var11_12.getType() != 6) break block12;
                        var12_13 = 0;
                        ** GOTO lbl37
lbl24:
                        // 1 sources

                        t.a(var2_2);
                        p.a(this.e(), var3_6);
                        return;
lbl-1000:
                        // 3 sources

                        {
                            for (var13_14 = 0; var13_14 < var11_12.getWidth(); ++var13_14) {
                                var14_15 = var11_12.getRGB(var13_14, var12_13);
                                if ((var14_15 & -16777216) == 0) continue;
                                var15_16 = (var14_15 & 0xFF0000) << 8 & -16777216;
                                var16_17 = var4_3.getRGB(var13_14, var12_13);
                                var17_18 = n.d(var16_17, var10_11.L) & 0xFFFFFF;
                                var11_12.setRGB(var13_14, var12_13, var15_16 | var17_18);
                            }
                            ++var12_13;
lbl37:
                            // 2 sources

                            ** while (var12_13 < var11_12.getHeight())
                        }
lbl38:
                        // 1 sources

                        var3_6.getGraphics().drawImage(var11_12, 0, 0, null);
                    }
                    finally {
                        t.a(var8_9);
                    }
                }
                ++var7_8;
                continue;
                break;
            }
        }
        catch (IOException var4_4) {
            net.minecraft.client.g.a.a.a.b("Couldn't load layered image", (Throwable)var4_4);
            t.a(var2_2);
            return;
        }
        catch (Throwable var19_20) {
            t.a(var2_2);
            throw var19_20;
        }
    }
}

