package com.abstracts.third;
public class DarkButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }
}