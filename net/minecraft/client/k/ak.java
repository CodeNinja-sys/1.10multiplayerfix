/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.ci;
import net.minecraft.client.k.cp;

public class ak
extends cc {
    @Override
    public void ct_() {
        this.r.clear();
        this.r.add(new cp(0, this.p / 2 - 155, this.q / 4 + 120 + 12, net.minecraft.client.f.u.a("gui.toTitle", new Object[0])));
        this.r.add(new cp(1, this.p / 2 - 155 + 160, this.q / 4 + 120 + 12, net.minecraft.client.f.u.a("menu.quit", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0) {
            this.n.a(new ci());
        } else if (ch2.j == 1) {
            this.n.n();
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, "Out of memory!", this.p / 2, this.q / 4 - 60 + 20, 0xFFFFFF);
        this.b(this.u, "Minecraft has run out of memory.", this.p / 2 - 140, this.q / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.b(this.u, "This could be caused by a bug in the game or by the", this.p / 2 - 140, this.q / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.b(this.u, "Java Virtual Machine not being allocated enough", this.p / 2 - 140, this.q / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.b(this.u, "memory.", this.p / 2 - 140, this.q / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.b(this.u, "To prevent level corruption, the current game has quit.", this.p / 2 - 140, this.q / 4 - 60 + 60 + 54, 0xA0A0A0);
        this.b(this.u, "We've tried to free up enough memory to let you go back to", this.p / 2 - 140, this.q / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.b(this.u, "the main menu and back to playing, but this may not have worked.", this.p / 2 - 140, this.q / 4 - 60 + 60 + 72, 0xA0A0A0);
        this.b(this.u, "Please restart the game if you see this message again.", this.p / 2 - 140, this.q / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.a(n2, n3, f2);
    }
}

