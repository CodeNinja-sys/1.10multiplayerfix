/*
 * Decompiled with CFR 0.150.
 */
public class d
extends bql {
    private bhl a;

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (bvp2.b("RecordItem", 10)) {
            this.a(bhl.a(bvp2.o("RecordItem")));
        } else if (bvp2.h("Record") > 0) {
            this.a(new bhl(azg.c(bvp2.h("Record"))));
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (this.a() != null) {
            bvp2.a("RecordItem", this.a().b(new bvp()));
        }
        return bvp2;
    }

    public bhl a() {
        return this.a;
    }

    public void a(bhl bhl2) {
        this.a = bhl2;
        this.c_();
    }
}

