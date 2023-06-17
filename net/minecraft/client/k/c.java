/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cq;
import net.minecraft.client.k.dn;
import net.minecraft.client.k.l;
import net.minecraft.client.k.r;
import net.minecraft.q.g.h;
import net.minecraft.u.bp;
import org.lwjgl.a.g;

public class c
extends cc {
    private static final List b = ov.a();
    private r c;
    private ch d;
    private dn e;
    private final cq f;
    protected String a = "Customize World Presets";
    private String g;
    private String h;

    static {
        h h2 = net.minecraft.q.g.h.a("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
        bp bp2 = new bp("textures/gui/presets/water.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bp2 = new bp("textures/gui/presets/isles.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.isleLand", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bp2 = new bp("textures/gui/presets/delight.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bp2 = new bp("textures/gui/presets/madness.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.mountains", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
        bp2 = new bp("textures/gui/presets/drought.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.drought", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
        bp2 = new bp("textures/gui/presets/chaos.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), bp2, h2));
        h2 = net.minecraft.q.g.h.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
        bp2 = new bp("textures/gui/presets/luck.png");
        b.add(new l(net.minecraft.client.f.u.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), bp2, h2));
    }

    public c(cq cq2) {
        this.f = cq2;
    }

    @Override
    public void ct_() {
        this.r.clear();
        org.lwjgl.a.g.a(true);
        this.a = net.minecraft.client.f.u.a("createWorld.customize.custom.presets.title", new Object[0]);
        this.g = net.minecraft.client.f.u.a("createWorld.customize.presets.share", new Object[0]);
        this.h = net.minecraft.client.f.u.a("createWorld.customize.presets.list", new Object[0]);
        this.e = new dn(2, this.u, 50, 40, this.p - 100, 20);
        this.c = new r(this);
        this.e.f(2000);
        this.e.a(this.f.f());
        this.d = this.b(new ch(0, this.p / 2 - 102, this.q - 27, 100, 20, net.minecraft.client.f.u.a("createWorld.customize.presets.select", new Object[0])));
        this.r.add(new ch(1, this.p / 2 + 3, this.q - 27, 100, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.e();
    }

    @Override
    public void cp_() {
        super.cp_();
        this.c.cr_();
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        this.e.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(char c2, int n2) {
        if (!this.e.a(c2, n2)) {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(ch ch2) {
        switch (ch2.j) {
            case 0: {
                this.f.a(this.e.b());
                this.n.a(this.f);
                break;
            }
            case 1: {
                this.n.a(this.f);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.c.a(n2, n3, f2);
        this.a(this.u, this.a, this.p / 2, 8, 0xFFFFFF);
        this.b(this.u, this.g, 50, 30, 0xA0A0A0);
        this.b(this.u, this.h, 50, 70, 0xA0A0A0);
        this.e.g();
        super.a(n2, n3, f2);
    }

    @Override
    public void bY_() {
        this.e.a();
        super.bY_();
    }

    public void e() {
        this.d.k = this.g();
    }

    private boolean g() {
        return this.c.a > -1 && this.c.a < b.size() || this.e.b().length() > 1;
    }

    static /* synthetic */ List f() {
        return b;
    }

    static /* synthetic */ dn a(c c2) {
        return c2.e;
    }

    static /* synthetic */ r b(c c2) {
        return c2.c;
    }
}

