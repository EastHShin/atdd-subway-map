package wooteco.subway.dto;

import wooteco.subway.domain.Station;

public class StationResponse {
    private Long id;
    private String name;

    private StationResponse() {
    }

    public StationResponse(final Station station) {
        this.id = station.getId();
        this.name = station.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
