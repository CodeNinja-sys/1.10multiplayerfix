/*
 * Decompiled with CFR 0.150.
 */
public class acl
extends ayh {
    public acl(wq wq2) {
        super(wq2);
    }

    @Override
    protected void b() {
        this.c = new chu(0.5f);
        this.d = new chu(1.0f);
    }

    protected void a(chu chu2, dfm dfm2) {
        this.a(chu2);
        switch (dfm2) {
            case f: {
                chu2.e.j = true;
                chu2.f.j = true;
                break;
            }
            case e: {
                chu2.g.j = true;
                chu2.h.j = true;
                chu2.i.j = true;
                break;
            }
            case d: {
                chu2.g.j = true;
                chu2.j.j = true;
                chu2.k.j = true;
                break;
            }
            case c: {
                chu2.j.j = true;
                chu2.k.j = true;
            }
        }
    }

    protected void a(chu chu2) {
        chu2.a(false);
    }
}

