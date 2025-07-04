package org.example.sealed;

public sealed interface SmartMediaPlayer permits Car {
    void connectPhone();
}
