/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.e;
import com.c.c.e.s;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;
import org.lwjgl.opengl.GL11;

public class ah
extends n {
    private final n a;
    private static final int b = 0;
    private static final int c = 1;
    private final String d = "If you have an older Minecraft account (you log in with your username),";
    private final String e = "you need to migrate the account to a Mojang account in order to access Realms.";
    private final String s = "As you probably know, Mojang is a part of Microsoft. Microsoft implements";
    private final String t = "certain procedures to help protect children and their privacy,";
    private final String u = "including complying with the Children\u2019s Online Privacy Protection Act (COPPA)";
    private final String v = "You may need to obtain parental consent before accessing your Realms account.";
    private boolean w = false;

    public ah(n n2) {
        this.a = n2;
    }

    @Override
    public void d() {
        this.u();
        this.b(ah.a(1, this.r() / 2 - 100, com.c.c.d.e.a(11), 200, 20, "Go to accounts page"));
        this.b(ah.a(0, this.r() / 2 - 100, com.c.c.d.e.a(13), 200, 20, "Back"));
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void a(f f2) {
        switch (f2.c()) {
            case 1: {
                com.c.c.e.s.a("https://accounts.mojang.com/me/verify/" + net.minecraft.s.b.g());
                break;
            }
            case 0: {
                net.minecraft.s.b.a(this.a);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.w) {
            com.c.c.e.s.a("http://www.ftc.gov/enforcement/rules/rulemaking-regulatory-reform-proceedings/childrens-online-privacy-protection-rule");
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a("If you have an older Minecraft account (you log in with your username),", this.r() / 2, 30, 0xFFFFFF);
        this.a("you need to migrate the account to a Mojang account in order to access Realms.", this.r() / 2, 45, 0xFFFFFF);
        this.a("As you probably know, Mojang is a part of Microsoft. Microsoft implements", this.r() / 2, 85, 0xFFFFFF);
        this.a("certain procedures to help protect children and their privacy,", this.r() / 2, 100, 0xFFFFFF);
        this.a("including complying with the Children\u2019s Online Privacy Protection Act (COPPA)", this.r() / 2, 115, 0xFFFFFF);
        this.a("You may need to obtain parental consent before accessing your Realms account.", this.r() / 2, 130, 0xFFFFFF);
        this.a(n2, n3);
        super.a(n2, n3, f2);
    }

    private void a(int n2, int n3) {
        String string = ah.f("Read more about COPPA");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        int n4 = this.e(string);
        int n5 = this.r() / 2 - n4 / 2;
        int n6 = 145;
        int n7 = n5;
        int n8 = n7 + n4 + 1;
        int n9 = n6;
        int n10 = n9 + this.t();
        GL11.f((float)n7, (float)n9, 0.0f);
        if (n7 <= n2 && n2 <= n8 && n9 <= n3 && n3 <= n10) {
            this.w = true;
            this.b(string, 0, 0, 7107012);
        } else {
            this.w = false;
            this.b(string, 0, 0, 0x3366BB);
        }
        GL11.k();
    }
}

