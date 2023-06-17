/*
 * Decompiled with CFR 0.150.
 */
class bwo
implements aho {
    private bwo() {
    }

    @Override
    public boolean a(yo yo2, iu iu2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || bhl2.a() != hp.cO) continue;
            if (bl2) {
                return false;
            }
            if (cwd.c(bhl2) >= 6) {
                return false;
            }
            bl2 = true;
        }
        if (!bl2) {
            return false;
        }
        return this.c(yo2) != null;
    }

    @Override
    public bhl a(yo yo2) {
        auv auv2;
        bhl bhl2 = null;
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null || bhl3.a() != hp.cO) continue;
            bhl2 = bhl3.j();
            bhl2.b = 1;
            break;
        }
        if ((auv2 = this.c(yo2)) != null) {
            bvp bvp2;
            Object object;
            int n2 = 0;
            for (int i3 = 0; i3 < yo2.aI_(); ++i3) {
                object = yo2.a(i3);
                if (object == null || ((bhl)object).a() != hp.bd) continue;
                n2 = ((bhl)object).h();
                break;
            }
            if ((bvp2 = bhl2.a("BlockEntityTag", true)).b("Patterns", 9)) {
                object = bvp2.c("Patterns", 10);
            } else {
                object = new bmh();
                bvp2.a("Patterns", (azt)object);
            }
            bvp bvp3 = new bvp();
            bvp3.a("Pattern", auv2.b());
            bvp3.a("Color", n2);
            ((bmh)object).a(bvp3);
        }
        return bhl2;
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public bhl b() {
        return null;
    }

    @Override
    public bhl[] b(yo yo2) {
        bhl[] arrbhl = new bhl[yo2.aI_()];
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || !bhl2.a().q()) continue;
            arrbhl[i2] = new bhl(bhl2.a().p());
        }
        return arrbhl;
    }

    private auv c(yo yo2) {
        for (auv auv2 : auv.values()) {
            int n2;
            int n3;
            int n4;
            if (!auv2.d()) continue;
            boolean bl2 = true;
            if (auv2.e()) {
                n4 = 0;
                n3 = 0;
                for (n2 = 0; n2 < yo2.aI_() && bl2; ++n2) {
                    bhl bhl2 = yo2.a(n2);
                    if (bhl2 == null || bhl2.a() == hp.cO) continue;
                    if (bhl2.a() == hp.bd) {
                        if (n3 != 0) {
                            bl2 = false;
                            break;
                        }
                        n3 = 1;
                        continue;
                    }
                    if (n4 == 0 && bhl2.a(auv2.f())) {
                        n4 = 1;
                        continue;
                    }
                    bl2 = false;
                    break;
                }
                if (n4 == 0) {
                    bl2 = false;
                }
            } else if (yo2.aI_() == auv2.c().length * auv2.c()[0].length()) {
                n4 = -1;
                for (n3 = 0; n3 < yo2.aI_() && bl2; ++n3) {
                    n2 = n3 / 3;
                    int n5 = n3 % 3;
                    bhl bhl3 = yo2.a(n3);
                    if (bhl3 == null || bhl3.a() == hp.cO) {
                        if (auv2.c()[n2].charAt(n5) == ' ') continue;
                        bl2 = false;
                        break;
                    }
                    if (bhl3.a() != hp.bd) {
                        bl2 = false;
                        break;
                    }
                    if (n4 != -1 && n4 != bhl3.h()) {
                        bl2 = false;
                        break;
                    }
                    if (auv2.c()[n2].charAt(n5) == ' ') {
                        bl2 = false;
                        break;
                    }
                    n4 = bhl3.h();
                }
            } else {
                bl2 = false;
            }
            if (!bl2) continue;
            return auv2;
        }
        return null;
    }

    /* synthetic */ bwo(apc apc2) {
        this();
    }
}

