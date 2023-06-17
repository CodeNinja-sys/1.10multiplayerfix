/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import org.apache.commons.c.c;

class ann
implements abu {
    private boolean d;
    private boolean e;
    private long f;
    final /* synthetic */ sz a;
    final /* synthetic */ cyq b;
    final /* synthetic */ lq c;

    ann(lq lq2, sz sz2, cyq cyq2) {
        this.c = lq2;
        this.a = sz2;
        this.b = cyq2;
    }

    @Override
    public void a(ctm ctm2) {
        CharSequence charSequence;
        if (this.e) {
            this.a.a(new aym("Received unrequested status"));
            return;
        }
        this.e = true;
        xr xr2 = ctm2.a();
        this.b.d = xr2.a() != null ? xr2.a().j() : "";
        if (xr2.c() != null) {
            this.b.g = xr2.c().a();
            this.b.f = xr2.c().b();
        } else {
            this.b.g = "Old";
            this.b.f = 0;
        }
        if (xr2.b() != null) {
            this.b.c = (Object)((Object)aug.h) + "" + xr2.b().b() + "" + (Object)((Object)aug.i) + "/" + (Object)((Object)aug.h) + xr2.b().a();
            if (org.apache.commons.c.c.g(xr2.b().c())) {
                charSequence = new StringBuilder();
                for (e e2 : xr2.b().c()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append(e2.b());
                }
                if (xr2.b().c().length < xr2.b().b()) {
                    if (((StringBuilder)charSequence).length() > 0) {
                        ((StringBuilder)charSequence).append("\n");
                    }
                    ((StringBuilder)charSequence).append("... and ").append(xr2.b().b() - xr2.b().c().length).append(" more ...");
                }
                this.b.i = ((StringBuilder)charSequence).toString();
            }
        } else {
            this.b.c = (Object)((Object)aug.i) + "???";
        }
        if (xr2.d() != null) {
            charSequence = xr2.d();
            if (((String)charSequence).startsWith("data:image/png;base64,")) {
                this.b.a(((String)charSequence).substring("data:image/png;base64,".length()));
            } else {
                lq.c().b("Invalid server icon (unknown format)");
            }
        } else {
            this.b.a((String)null);
        }
        this.f = bxy.K();
        this.a.a(new j(this.f));
        this.d = true;
    }

    @Override
    public void a(coc coc2) {
        long l2 = this.f;
        long l3 = bxy.K();
        this.b.e = l3 - l2;
        this.a.a(new aym("Finished"));
    }

    @Override
    public void a(cbg cbg2) {
        if (!this.d) {
            lq.c().b("Can't ping {}: {}", this.b.b, cbg2.i());
            this.b.d = (Object)((Object)aug.e) + "Can't connect to server.";
            this.b.c = "";
            lq.a(this.c, this.b);
        }
    }
}

