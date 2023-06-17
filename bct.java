/*
 * Decompiled with CFR 0.150.
 */
class bct
extends sy {
    final /* synthetic */ bax b;

    bct(bax bax2) {
        this.b = bax2;
    }

    @Override
    protected up a(dbk dbk2) {
        bjn bjn2 = (bjn)((Object)dbk2.b(ddd.a));
        switch (bjn2) {
            default: {
                return new up("quartz_block", "normal");
            }
            case b: {
                return new up("chiseled_quartz_block", "normal");
            }
            case c: {
                return new up("quartz_column", "axis=y");
            }
            case d: {
                return new up("quartz_column", "axis=x");
            }
            case e: 
        }
        return new up("quartz_column", "axis=z");
    }
}

