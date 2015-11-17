package com.example.Anwar_ASI.popularmoviesasi;

import java.util.List;

public class VideoReview {

    public Trailerset trailers;
    public Reviewset reviews;

    public class Trailerset {
        List<Youtubeset> youtube;
    }

    public class Reviewset {
        List<Resultset> results;
    }

    public class Youtubeset{
        String source;
    }

    public class Resultset{
        String author;
        String content;
    }
}
