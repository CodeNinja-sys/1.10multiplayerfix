/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.m;
import com.c.c.d.a.bd;
import com.c.c.d.a.s;
import com.c.c.d.e;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class bc
extends n {
    private static final int e = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final int v = 4;
    private static final int w = 5;
    private static final int x = 6;
    private static final int y = 7;
    private static final int z = 8;
    private static final int A = 9;
    private static final int B = 10;
    private static final int C = 11;
    private k D;
    protected final s a;
    private int E;
    private int F;
    private int G;
    private com.c.c.b.s H;
    private m I;
    private int J;
    private int K;
    private int L;
    private Boolean M;
    private Boolean N;
    private Boolean O;
    private Boolean P;
    private Integer Q;
    private Boolean R;
    private Boolean S;
    private f T;
    private f U;
    private f V;
    private f W;
    private net.minecraft.s.s X;
    private f Y;
    private f Z;
    private boolean aa = false;
    String[] b;
    String[] c;
    String[][] d;

    public bc(s s2, com.c.c.b.s s3, m m2, int n2) {
        this.a = s2;
        this.H = s3;
        this.I = m2;
        this.J = n2;
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void g() {
        this.D.b();
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 1: {
                this.z();
                break;
            }
            case 0: {
                net.minecraft.s.b.a(this.a);
                break;
            }
            case 2: {
                this.K = (this.K + 1) % this.b.length;
                f2.a(this.e());
                if (!this.I.equals((Object)com.c.c.b.m.a)) break;
                this.V.b(this.K != 0);
                this.V.a(this.k());
                break;
            }
            case 3: {
                this.L = (this.L + 1) % this.c.length;
                f2.a(this.f());
                break;
            }
            case 4: {
                this.M = this.M == false;
                f2.a(this.i());
                break;
            }
            case 5: {
                this.O = this.O == false;
                f2.a(this.j());
                break;
            }
            case 7: {
                this.N = this.N == false;
                f2.a(this.l());
                break;
            }
            case 6: {
                this.P = this.P == false;
                f2.a(this.k());
                break;
            }
            case 9: {
                this.R = this.R == false;
                f2.a(this.m());
                break;
            }
            case 10: {
                this.S = this.S == false;
                f2.a(this.n());
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        this.D.a(c2, n2);
        switch (n2) {
            case 15: {
                this.D.a(!this.D.c());
                break;
            }
            case 1: {
                net.minecraft.s.b.a(this.a);
                break;
            }
            case 28: 
            case 156: {
                this.z();
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.D.a(n2, n3, n4);
    }

    @Override
    public void d() {
        this.F = 170;
        this.E = this.r() / 2 - this.F * 2 / 2;
        this.G = this.r() / 2 + 10;
        this.c();
        this.K = this.H.h;
        this.L = this.H.i;
        if (!this.I.equals((Object)com.c.c.b.m.a)) {
            this.aa = true;
            this.M = true;
            this.Q = 0;
            this.S = false;
            this.O = true;
            this.P = true;
            this.N = true;
            this.R = true;
        } else {
            this.M = this.H.a;
            this.Q = this.H.e;
            this.S = this.H.g;
            this.O = this.H.b;
            this.P = this.H.c;
            this.N = this.H.d;
            this.R = this.H.f;
        }
        this.D = this.a(11, this.E + 2, com.c.c.d.e.a(1), this.F - 4, 20);
        this.D.a(true);
        this.D.a(10);
        this.D.a(this.H.a(this.J));
        this.T = bc.a(4, this.G, com.c.c.d.e.a(1), this.F, 20, this.i());
        this.b(this.T);
        this.b(bc.a(3, this.E, com.c.c.d.e.a(3), this.F, 20, this.f()));
        this.U = bc.a(5, this.G, com.c.c.d.e.a(3), this.F, 20, this.j());
        this.b(this.U);
        this.b(bc.a(2, this.E, com.c.c.d.e.a(5), this.F, 20, this.e()));
        this.V = bc.a(6, this.G, com.c.c.d.e.a(5), this.F, 20, this.k());
        this.b(this.V);
        this.X = new bd(this, 8, this.E, com.c.c.d.e.a(7), this.F, 17, this.Q, 0.0f, 16.0f);
        this.b(this.X);
        this.W = bc.a(7, this.G, com.c.c.d.e.a(7), this.F, 20, this.l());
        this.b(this.W);
        this.Z = bc.a(10, this.E, com.c.c.d.e.a(9), this.F, 20, this.n());
        this.b(this.Z);
        this.Y = bc.a(9, this.G, com.c.c.d.e.a(9), this.F, 20, this.m());
        this.b(this.Y);
        if (!this.I.equals((Object)com.c.c.b.m.a)) {
            this.T.b(false);
            this.U.b(false);
            this.W.b(false);
            this.V.b(false);
            this.X.b(false);
            this.Y.b(false);
            this.X.b(false);
            this.Z.b(false);
        }
        if (this.K == 0) {
            this.V.b(false);
        }
        this.b(bc.a(1, this.E, com.c.c.d.e.a(13), this.F, 20, bc.f("mco.configure.world.buttons.done")));
        this.b(bc.a(0, this.G, com.c.c.d.e.a(13), this.F, 20, bc.f("gui.cancel")));
    }

    private void c() {
        this.b = new String[]{bc.f("options.difficulty.peaceful"), bc.f("options.difficulty.easy"), bc.f("options.difficulty.normal"), bc.f("options.difficulty.hard")};
        this.c = new String[]{bc.f("selectWorld.gameMode.survival"), bc.f("selectWorld.gameMode.creative"), bc.f("selectWorld.gameMode.adventure")};
        this.d = new String[][]{{bc.f("selectWorld.gameMode.survival.line1"), bc.f("selectWorld.gameMode.survival.line2")}, {bc.f("selectWorld.gameMode.creative.line1"), bc.f("selectWorld.gameMode.creative.line2")}, {bc.f("selectWorld.gameMode.adventure.line1"), bc.f("selectWorld.gameMode.adventure.line2")}};
    }

    private String e() {
        String string = bc.f("options.difficulty");
        return string + ": " + this.b[this.K];
    }

    private String f() {
        String string = bc.f("selectWorld.gameMode");
        return string + ": " + this.c[this.L];
    }

    private String i() {
        return bc.f("mco.configure.world.pvp") + ": " + (this.M != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    private String j() {
        return bc.f("mco.configure.world.spawnAnimals") + ": " + (this.O != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    private String k() {
        if (this.K == 0) {
            return bc.f("mco.configure.world.spawnMonsters") + ": " + bc.f("mco.configure.world.off");
        }
        return bc.f("mco.configure.world.spawnMonsters") + ": " + (this.P != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    private String l() {
        return bc.f("mco.configure.world.spawnNPCs") + ": " + (this.N != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    private String m() {
        return bc.f("mco.configure.world.commandBlocks") + ": " + (this.R != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    private String n() {
        return bc.f("mco.configure.world.forceGameMode") + ": " + (this.S != false ? bc.f("mco.configure.world.on") : bc.f("mco.configure.world.off"));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        String string = bc.f("mco.configure.world.edit.slot.name");
        this.b(string, this.E + this.F / 2 - this.e(string) / 2, com.c.c.d.e.a(0) - 5, 0xFFFFFF);
        this.a(bc.f("mco.configure.world.buttons.options"), this.r() / 2, 17, 0xFFFFFF);
        if (this.aa) {
            this.a(bc.f("mco.configure.world.edit.subscreen.adventuremap"), this.r() / 2, 30, 0xFF0000);
        }
        this.D.d();
        super.a(n2, n3, f2);
    }

    public void b() {
        this.b(this.d[this.L][0], this.G + 2, com.c.c.d.e.a(0), 0xA0A0A0);
        this.b(this.d[this.L][1], this.G + 2, com.c.c.d.e.a(0) + this.t() + 2, 0xA0A0A0);
    }

    @Override
    public void b(int n2, int n3, int n4) {
        if (!this.X.d()) {
            return;
        }
        this.X.c(n2, n3);
    }

    @Override
    public void a(int n2, int n3, int n4, long l2) {
        if (!this.X.d()) {
            return;
        }
        if (n2 < this.E + this.X.e() && n2 > this.E && n3 < this.X.g() + 20 && n3 > this.X.g()) {
            this.X.b(n2, n3);
        }
    }

    private String y() {
        if (this.D.a().equals(this.H.b(this.J))) {
            return "";
        }
        return this.D.a();
    }

    private void z() {
        if (this.I.equals((Object)com.c.c.b.m.c)) {
            this.a.a(new com.c.c.b.s(this.H.a, this.H.b, this.H.c, this.H.d, this.H.e, this.H.f, this.K, this.L, this.H.g, this.y()));
        } else {
            this.a.a(new com.c.c.b.s(this.M, this.O, this.P, this.N, this.Q, this.R, this.K, this.L, this.S, this.y()));
        }
    }

    static /* synthetic */ Integer a(bc bc2) {
        return bc2.Q;
    }

    static /* synthetic */ net.minecraft.s.s b(bc bc2) {
        return bc2.X;
    }

    static /* synthetic */ Integer a(bc bc2, Integer n2) {
        bc2.Q = n2;
        return bc2.Q;
    }
}

