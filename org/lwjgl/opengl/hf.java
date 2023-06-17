/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.dn;
import org.lwjgl.opengl.fp;

class hf
extends fp
implements MouseListener,
MouseMotionListener,
MouseWheelListener {
    private static final int b = 120;
    public static final int a = 3;
    private final Component c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private final ByteBuffer k = ByteBuffer.allocate(22);
    private final byte[] l = new byte[3];

    hf(Component component) {
        super(22);
        this.c = component;
    }

    public synchronized void d() {
        this.b();
        if (this.c != null) {
            this.c.addMouseListener(this);
            this.c.addMouseMotionListener(this);
            this.c.addMouseWheelListener(this);
        }
    }

    public synchronized void e() {
        if (this.c != null) {
            this.c.removeMouseListener(this);
            this.c.removeMouseMotionListener(this);
            this.c.removeMouseWheelListener(this);
        }
    }

    protected Component f() {
        return this.c;
    }

    public synchronized void a(boolean bl2) {
        this.d = bl2;
        this.b();
    }

    public synchronized boolean g() {
        return this.d;
    }

    protected int a(int n2) {
        if (this.c != null) {
            return this.c.getHeight() - 1 - n2;
        }
        return n2;
    }

    protected void b() {
        Point point;
        this.a();
        this.f = 0;
        this.e = 0;
        if (this.c != null && (point = dn.b(this.c)) != null) {
            this.h = point.x;
            this.i = point.y;
        }
    }

    private void a(byte by2, byte by3, int n2, long l2) {
        if (this.d) {
            this.a(by2, by3, 0, 0, n2, l2);
        } else {
            this.a(by2, by3, this.h, this.i, n2, l2);
        }
    }

    protected void a(byte by2, byte by3, int n2, int n3, int n4, long l2) {
        this.k.clear();
        this.k.put(by2).put(by3).putInt(n2).putInt(n3).putInt(n4).putLong(l2);
        this.k.flip();
        this.b(this.k);
    }

    public synchronized void a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        if (this.d) {
            intBuffer.put(0, this.e);
            intBuffer.put(1, this.f);
        } else {
            intBuffer.put(0, this.h);
            intBuffer.put(1, this.i);
        }
        intBuffer.put(2, this.g);
        this.g = 0;
        this.f = 0;
        this.e = 0;
        int n2 = byteBuffer.position();
        byteBuffer.put(this.l, 0, this.l.length);
        byteBuffer.position(n2);
    }

    private void a(int n2, int n3, long l2) {
        n3 = this.a(n3);
        if (this.d) {
            return;
        }
        int n4 = n2 - this.h;
        int n5 = n3 - this.i;
        this.a(n4, n5);
        this.h = n2;
        this.i = n3;
        this.a((byte)-1, (byte)0, n2, n3, 0, l2);
    }

    protected void a(int n2, int n3) {
        this.e += n2;
        this.f += n3;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    private void a(MouseEvent mouseEvent) {
        byte by2;
        byte by3;
        switch (mouseEvent.getID()) {
            case 501: {
                by3 = 1;
                break;
            }
            case 502: {
                by3 = 0;
                break;
            }
            default: {
                throw new IllegalArgumentException("Not a valid event ID: " + mouseEvent.getID());
            }
        }
        switch (mouseEvent.getButton()) {
            case 0: {
                return;
            }
            case 1: {
                if (by3 == 1) {
                    this.j = mouseEvent.isControlDown();
                }
                if (this.j) {
                    if (this.l[1] == by3) {
                        return;
                    }
                    by2 = 1;
                    break;
                }
                by2 = 0;
                break;
            }
            case 2: {
                by2 = 2;
                break;
            }
            case 3: {
                if (this.l[1] == by3) {
                    return;
                }
                by2 = 1;
                break;
            }
            default: {
                throw new IllegalArgumentException("Not a valid button: " + mouseEvent.getButton());
            }
        }
        this.a(by2, by3, mouseEvent.getWhen() * 1000000L);
    }

    public synchronized void mousePressed(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    private void a(byte by2, byte by3, long l2) {
        this.l[by2] = by3;
        this.a(by2, by3, 0, l2);
    }

    public synchronized void mouseReleased(MouseEvent mouseEvent) {
        this.a(mouseEvent);
    }

    private void b(MouseEvent mouseEvent) {
        if (this.d) {
            this.a(mouseEvent.getWhen() * 1000000L);
        } else {
            this.a(mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getWhen() * 1000000L);
        }
    }

    public synchronized void mouseDragged(MouseEvent mouseEvent) {
        this.b(mouseEvent);
    }

    public synchronized void mouseMoved(MouseEvent mouseEvent) {
        this.b(mouseEvent);
    }

    private void a(int n2, long l2) {
        this.g += n2;
        this.a((byte)-1, (byte)0, n2, l2);
    }

    protected void a(long l2) {
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        int n2 = -mouseWheelEvent.getWheelRotation() * 120;
        this.a(n2, mouseWheelEvent.getWhen() * 1000000L);
    }
}

