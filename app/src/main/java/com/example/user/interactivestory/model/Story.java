package com.example.user.interactivestory.model;

import com.example.user.interactivestory.R;

/**
 * Created by user on 8/30/2015.
 */
public class Story {

    private Page[] mPages;

        public Story(){

            mPages = new Page[7];
            mPages[0] = new Page(
                    "On your return trip from studying Saturn's rings, you hear a distress signal that seems to be coming from the surface of Mars. It's strange because there hasn't been a colony there in years. Even stranger, it's calling you by name: \"Help me, %1$s, you're my only hope.\"",
                    R.drawable.page0,
                    new Choice("Stop and Investigate",1),
                    new Choice("Continue Home to Earth", 2));

            mPages[1] = new Page(
                    "You deftly land your ship near where the distress signal originated. You didn't notice anything strange on your fly-by, but there is a cave in front of you. Behind you is an abandoned rover from the early 21st century.",
                    R.drawable.page1,
                    new Choice("Explore the Cave", 3),
                    new Choice("Explore the Rover",4));

            mPages[2] = new Page(
                    "You continue your course to Earth. Two days later, you receive a transmission from HQ saying that they have detected some sort of anomaly on the surface of Mars near an abandoned rover. They ask you to investigate, but ultimately the decision is yours because your mission has already run much longer than planned and supplies are low.",
                    R.drawable.page2,
                    new Choice("Continue Back To Mars To Investigate",4),
                    new Choice("Continue Home to Earth", 6));
            mPages[3] = new Page(
                    "Your EVA suit is equipped with a headlamp, which you use to navigate the cave. After searching for a while your oxygen levels are starting to get pretty low. You know you should go refill your tank, but there's a very faint light up ahead.",
                    R.drawable.page3,
                    new Choice("Refill at Ship and Explore the Rover", 4),
                    new Choice("Continue Towards the Faint Light", 5));
            mPages[4] = new Page(
                    "The rover is covered in dust and most of the solar panels are broken. But you are quite surprised to see the on-board system booted up and running. In fact, there is a message on the screen: \"%1$s, come to 28.543436, -81.369031.\" Those coordinates aren't far, but you don't know if your oxygen will last there and back.",
                    R.drawable.page4,
                    new Choice("Explore the coordinates", 5),
                    new Choice("Return to Earth", 6));
            mPages[5] = new Page(
                    "After a long walk slightly uphill, you end up at the top of a small crater. You look around, and are overjoyed to see your favorite android, %1$s-S1124. It had been lost on a previous mission to Mars! You take it back to your ship and fly back to Earth.",
                    R.drawable.page5);
            mPages[6] = new Page(
                    "You arrive home on Earth. While your mission was a success, you forever wonder what was sending that signal. Perhaps a future mission will be able to investigate...",
                    R.drawable.page6);




        }

        public Page getPage(int pageNo){
            return mPages[pageNo];
        }
}
