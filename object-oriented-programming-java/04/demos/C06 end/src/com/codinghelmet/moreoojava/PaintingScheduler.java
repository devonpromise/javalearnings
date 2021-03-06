package com.codinghelmet.moreoojava;

import java.util.List;
import java.util.stream.Stream;

public interface PaintingScheduler {
    Stream<WorkAssignment> schedule(List<Painter> painters, double sqMeters);
}
