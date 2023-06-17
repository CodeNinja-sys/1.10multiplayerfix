/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.a;
import e.a.b.f;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;

public class b
extends a {
    public IntBuffer e;
    public int f;
    public int g;
    public float h = 0.0f;

    public b(int n2, IntBuffer intBuffer) {
        super(n2);
        this.a = f.class;
        this.e = intBuffer;
    }

    public void a() {
        if (this.e != null) {
            try {
                AL10.e(this.e);
                AL10.a();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                AL10.b(this.e);
                AL10.a();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.e.clear();
        }
        this.e = null;
        super.a();
    }

    public boolean a(IntBuffer intBuffer) {
        if (this.a(this.b != 0, "Sound buffers may only be attached to normal sources.")) {
            return false;
        }
        AL10.a(this.e.get(0), 4105, intBuffer.get(0));
        if (this.c != null && this.c.t != null && this.c.t.b != null) {
            this.a(this.c.t.b);
        }
        return this.m();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(AudioFormat audioFormat) {
        int n2 = 0;
        if (audioFormat.getChannels() == 1) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n2 = 4352;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.c("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n2 = 4353;
            }
        } else {
            if (audioFormat.getChannels() != 2) {
                this.c("Audio data neither mono nor stereo in method 'setAudioFormat'");
                return;
            }
            if (audioFormat.getSampleSizeInBits() == 8) {
                n2 = 4354;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.c("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n2 = 4355;
            }
        }
        this.f = n2;
        this.g = (int)audioFormat.getSampleRate();
    }

    public void a(int n2, int n3) {
        this.f = n2;
        this.g = n3;
    }

    public boolean a(LinkedList linkedList) {
        IntBuffer intBuffer;
        int n2;
        if (this.a(this.b != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.a(linkedList == null, "Buffer List null in method 'preLoadBuffers'")) {
            return false;
        }
        boolean bl2 = this.k();
        if (bl2) {
            AL10.o(this.e.get(0));
            this.m();
        }
        if ((n2 = AL10.b(this.e.get(0), 4118)) > 0) {
            intBuffer = BufferUtils.d(n2);
            AL10.g(intBuffer);
            if (this.a(this.m(), "Error clearing stream buffers in method 'preLoadBuffers'")) {
                return false;
            }
            AL10.c(this.e.get(0), intBuffer);
            if (this.a(this.m(), "Error unqueuing stream buffers in method 'preLoadBuffers'")) {
                return false;
            }
        }
        if (bl2) {
            AL10.m(this.e.get(0));
            this.m();
        }
        intBuffer = BufferUtils.d(linkedList.size());
        AL10.g(intBuffer);
        if (this.a(this.m(), "Error generating stream buffers in method 'preLoadBuffers'")) {
            return false;
        }
        ByteBuffer byteBuffer = null;
        for (int i2 = 0; i2 < linkedList.size(); ++i2) {
            byteBuffer = (ByteBuffer)BufferUtils.a(((byte[])linkedList.get(i2)).length).put((byte[])linkedList.get(i2)).flip();
            try {
                AL10.a(intBuffer.get(i2), this.f, byteBuffer, this.g);
            }
            catch (Exception exception) {
                this.c("Error creating buffers in method 'preLoadBuffers'");
                this.a(exception);
                return false;
            }
            if (!this.a(this.m(), "Error creating buffers in method 'preLoadBuffers'")) continue;
            return false;
        }
        try {
            AL10.b(this.e.get(0), intBuffer);
        }
        catch (Exception exception) {
            this.c("Error queuing buffers in method 'preLoadBuffers'");
            this.a(exception);
            return false;
        }
        if (this.a(this.m(), "Error queuing buffers in method 'preLoadBuffers'")) {
            return false;
        }
        AL10.m(this.e.get(0));
        return !this.a(this.m(), "Error playing source in method 'preLoadBuffers'");
    }

    public boolean a(byte[] arrby) {
        if (this.a(this.b != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.a(arrby.length).put(arrby).flip();
        IntBuffer intBuffer = BufferUtils.d(1);
        AL10.c(this.e.get(0), intBuffer);
        if (this.m()) {
            return false;
        }
        if (AL10.r(intBuffer.get(0))) {
            this.h += this.a(intBuffer.get(0));
        }
        this.m();
        AL10.a(intBuffer.get(0), this.f, byteBuffer, this.g);
        if (this.m()) {
            return false;
        }
        AL10.b(this.e.get(0), intBuffer);
        return !this.m();
    }

    public int b(byte[] arrby) {
        IntBuffer intBuffer;
        if (this.a(this.b != 1, "Raw audio data can only be fed to streaming sources.")) {
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.a(arrby.length).put(arrby).flip();
        int n2 = AL10.b(this.e.get(0), 4118);
        if (n2 > 0) {
            intBuffer = BufferUtils.d(n2);
            AL10.g(intBuffer);
            if (this.a(this.m(), "Error clearing stream buffers in method 'feedRawAudioData'")) {
                return -1;
            }
            AL10.c(this.e.get(0), intBuffer);
            if (this.a(this.m(), "Error unqueuing stream buffers in method 'feedRawAudioData'")) {
                return -1;
            }
            if (AL10.r(intBuffer.get(0))) {
                this.h += this.a(intBuffer.get(0));
            }
            this.m();
        } else {
            intBuffer = BufferUtils.d(1);
            AL10.g(intBuffer);
            if (this.a(this.m(), "Error generating stream buffers in method 'preLoadBuffers'")) {
                return -1;
            }
        }
        AL10.a(intBuffer.get(0), this.f, byteBuffer, this.g);
        if (this.m()) {
            return -1;
        }
        AL10.b(this.e.get(0), intBuffer);
        if (this.m()) {
            return -1;
        }
        if (this.c != null && this.c.s == this && this.c.s() && !this.k()) {
            AL10.m(this.e.get(0));
            this.m();
        }
        return n2;
    }

    public float a(int n2) {
        return (float)AL10.d(n2, 8196) / (float)AL10.d(n2, 8195) / ((float)AL10.d(n2, 8194) / 8.0f) / (float)this.g * 1000.0f;
    }

    public float c() {
        float f2 = AL10.b(this.e.get(0), 4134);
        float f3 = 1.0f;
        switch (this.f) {
            case 4352: {
                f3 = 1.0f;
                break;
            }
            case 4353: {
                f3 = 2.0f;
                break;
            }
            case 4354: {
                f3 = 2.0f;
                break;
            }
            case 4355: {
                f3 = 4.0f;
                break;
            }
        }
        f2 = f2 / f3 / (float)this.g * 1000.0f;
        if (this.b == 1) {
            f2 += this.h;
        }
        return f2;
    }

    public int b() {
        if (this.b != 1) {
            return 0;
        }
        int n2 = AL10.b(this.e.get(0), 4118);
        if (this.m()) {
            return 0;
        }
        return n2;
    }

    public void e() {
        if (this.b != 1) {
            return;
        }
        if (this.m()) {
            return;
        }
        IntBuffer intBuffer = BufferUtils.d(1);
        for (int i2 = AL10.b(this.e.get(0), 4117); i2 > 0; --i2) {
            try {
                AL10.c(this.e.get(0), intBuffer);
            }
            catch (Exception exception) {
                return;
            }
            if (!this.m()) continue;
            return;
        }
        this.h = 0.0f;
    }

    public void f() {
        try {
            AL10.o(this.e.get(0));
            AL10.a();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.b == 1) {
            this.e();
        }
    }

    public void g() {
        AL10.m(this.e.get(0));
        this.m();
    }

    public void h() {
        AL10.n(this.e.get(0));
        this.m();
    }

    public void i() {
        AL10.o(this.e.get(0));
        if (!this.m()) {
            this.h = 0.0f;
        }
    }

    public void j() {
        if (this.b == 1) {
            return;
        }
        AL10.p(this.e.get(0));
        if (!this.m()) {
            this.h = 0.0f;
        }
    }

    public boolean k() {
        int n2 = AL10.b(this.e.get(0), 4112);
        if (this.m()) {
            return false;
        }
        return n2 == 4114;
    }

    private boolean m() {
        switch (AL10.a()) {
            case 0: {
                return false;
            }
            case 40961: {
                this.c("Invalid name parameter.");
                return true;
            }
            case 40962: {
                this.c("Invalid parameter.");
                return true;
            }
            case 40963: {
                this.c("Invalid enumerated parameter value.");
                return true;
            }
            case 40964: {
                this.c("Illegal call.");
                return true;
            }
            case 40965: {
                this.c("Unable to allocate memory.");
                return true;
            }
        }
        this.c("An unrecognized error occurred.");
        return true;
    }
}

