package com.abstracts.third;
public class LightButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }
}