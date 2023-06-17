/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ddw
extends dar {
    @Override
    public cwt a(iu iu2, bhl bhl2, bga bga2) {
        bib bib2 = new bib(iu2, bga2);
        bib2.a(bhl2);
        return bib2;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (hy hy2 : hy.a) {
            list.add(anl.a(new bhl(azg2), hy2));
        }
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        anl.a(bhl2, list, 0.125f);
    }

    @Override
    public String c(bhl bhl2) {
        return caf.a(anl.c(bhl2).b("tipped_arrow.effect."));
    }
}

