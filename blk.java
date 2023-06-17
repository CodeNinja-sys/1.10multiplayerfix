/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import org.lwjgl.a.g;

public class blk
extends cjn {
    private static final List b = ov.a();
    private bne c;
    private cwv d;
    private cld e;
    private final cee f;
    protected String a = "Customize World Presets";
    private String g;
    private String h;

    public blk(cee cee2) {
        this.f = cee2;
    }

    @Override
    public void cH_() {
        this.y.clear();
        org.lwjgl.a.g.a(true);
        this.a = bf.a("createWorld.customize.custom.presets.title", new Object[0]);
        this.g = bf.a("createWorld.customize.presets.share", new Object[0]);
        this.h = bf.a("createWorld.customize.presets.list", new Object[0]);
        this.e = new cld(2, this.B, 50, 40, this.w - 100, 20);
        this.c = new bne(this);
        this.e.f(2000);
        this.e.a(this.f.f());
        this.d = this.b(new cwv(0, this.w / 2 - 102, this.x - 27, 100, 20, bf.a("createWorld.customize.presets.select", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 + 3, this.x - 27, 100, 20, bf.a("gui.cancel", new Object[0])));
        this.f();
    }

    @Override
    public void p_() {
        super.p_();
        this.c.i();
    }

    @Override
    public void aG_() {
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
    protected void a(cwv cwv2) {
        switch (cwv2.j) {
            case 0: {
                this.f.a(this.e.b());
                this.u.a(this.f);
                break;
            }
            case 1: {
                this.u.a(this.f);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.c.a(n2, n3, f2);
        this.a(this.B, this.a, this.w / 2, 8, 0xFFFFFF);
        this.b(this.B, this.g, 50, 30, 0xA0A0A0);
        this.b(this.B, this.h, 50, 70, 0xA0A0A0);
        this.e.g();
        super.a(n2, n3, f2);
    }

    @Override
    public void d() {
        this.e.a();
        super.d();
    }

    public void f() {
        this.d.k = this.i();
    }

    private boolean i() {
        return this.c.a > -1 && this.c.a < b.size() || this.e.b().length() > 1;
    }

    static /* synthetic */ List h() {
        return b;
    }

    static /* synthetic */ bne a(blk blk2) {
        return blk2.c;
    }

    static /* synthetic */ cld b(blk blk2) {
        return blk2.e;
    }

    static /* synthetic */ void a(blk blk2, int n2, int n3, int n4, int n5) {
        blk2.a(n2, n3, n4, n5);
    }

    static /* synthetic */ void b(blk blk2, int n2, int n3, int n4, int n5) {
        blk2.a(n2, n3, n4, n5);
    }

    static /* synthetic */ void c(blk blk2, int n2, int n3, int n4, int n5) {
        blk2.b(n2, n3, n4, n5);
    }

    static /* synthetic */ void d(blk blk2, int n2, int n3, int n4, int n5) {
        blk2.b(n2, n3, n4, n5);
    }

    static {
        bqr bqr2 = bqr.a("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
        bpx bpx2 = new bpx("textures/gui/presets/water.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bpx2 = new bpx("textures/gui/presets/isles.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.isleLand", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bpx2 = new bpx("textures/gui/presets/delight.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        bpx2 = new bpx("textures/gui/presets/madness.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.mountains", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
        bpx2 = new bpx("textures/gui/presets/drought.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.drought", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
        bpx2 = new bpx("textures/gui/presets/chaos.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), bpx2, bqr2));
        bqr2 = bqr.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
        bpx2 = new bpx("textures/gui/presets/luck.png");
        b.add(new kr(bf.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), bpx2, bqr2));
    }
}

