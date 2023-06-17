/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class dr
extends ap {
    private cu a;

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("RecordItem", 10)) {
            this.a(cu.a(e2.o("RecordItem")));
        } else if (e2.h("Record") > 0) {
            this.a(new cu(cg.c(e2.h("Record"))));
        }
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        if (this.g() != null) {
            e2.a("RecordItem", this.g().b(new e()));
        }
        return e2;
    }

    public cu g() {
        return this.a;
    }

    public void a(cu cu2) {
        this.a = cu2;
        this.C();
    }
}

