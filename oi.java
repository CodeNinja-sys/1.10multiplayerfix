/*
 * Decompiled with CFR 0.150.
 */
public enum oi {
    a("options.invertMouse", false, true),
    b("options.sensitivity", true, false),
    c("options.fov", true, false, 30.0f, 110.0f, 1.0f),
    d("options.gamma", true, false),
    e("options.saturation", true, false),
    f("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f),
    g("options.viewBobbing", false, true),
    h("options.anaglyph", false, true),
    i("options.framerateLimit", true, false, 10.0f, 260.0f, 10.0f),
    j("options.fboEnable", false, true),
    k("options.renderClouds", false, false),
    l("options.graphics", false, false),
    m("options.ao", false, false),
    n("options.guiScale", false, false),
    o("options.particles", false, false),
    p("options.chat.visibility", false, false),
    q("options.chat.color", false, true),
    r("options.chat.links", false, true),
    s("options.chat.opacity", true, false),
    t("options.chat.links.prompt", false, true),
    u("options.snooper", false, true),
    v("options.fullscreen", false, true),
    w("options.vsync", false, true),
    x("options.vbo", false, true),
    y("options.touchscreen", false, true),
    z("options.chat.scale", true, false),
    A("options.chat.width", true, false),
    B("options.chat.height.focused", true, false),
    C("options.chat.height.unfocused", true, false),
    D("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f),
    E("options.forceUnicodeFont", false, true),
    F("options.reducedDebugInfo", false, true),
    G("options.entityShadows", false, true),
    H("options.mainHand", false, false),
    I("options.attackIndicator", false, false),
    J("options.enableWeakAttacks", false, true),
    K("options.showSubtitles", false, true),
    L("options.realmsNotifications", false, true),
    M("options.autoJump", false, true);

    private final boolean N;
    private final boolean O;
    private final String P;
    private final float Q;
    private float R;
    private float S;

    public static oi a(int n2) {
        for (oi oi2 : oi.values()) {
            if (oi2.c() != n2) continue;
            return oi2;
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private oi(boolean bl2) {
        this((String)var1_-1, (int)var2_-1, (String)bl2, (boolean)var4_2, (boolean)var5_3, 0.0f, 1.0f, 0.0f);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private oi(boolean bl2, float f2, float f3, float f4) {
        void var8_6;
        void var7_5;
        this.P = (String)bl2;
        this.N = f2;
        this.O = f3;
        this.R = f4;
        this.S = var7_5;
        this.Q = var8_6;
    }

    public boolean a() {
        return this.N;
    }

    public boolean b() {
        return this.O;
    }

    public int c() {
        return this.ordinal();
    }

    public String d() {
        return this.P;
    }

    public float e() {
        return this.R;
    }

    public float f() {
        return this.S;
    }

    public void a(float f2) {
        this.S = f2;
    }

    public float b(float f2) {
        return cmk.a((this.d(f2) - this.R) / (this.S - this.R), 0.0f, 1.0f);
    }

    public float c(float f2) {
        return this.d(this.R + (this.S - this.R) * cmk.a(f2, 0.0f, 1.0f));
    }

    public float d(float f2) {
        f2 = this.e(f2);
        return cmk.a(f2, this.R, this.S);
    }

    private float e(float f2) {
        if (this.Q > 0.0f) {
            f2 = this.Q * (float)Math.round(f2 / this.Q);
        }
        return f2;
    }

    static /* synthetic */ float a(oi oi2) {
        return oi2.S;
    }

    static /* synthetic */ float b(oi oi2) {
        return oi2.R;
    }
}

