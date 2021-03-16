package ru.flendger.clouddemo.eurekaclient.mappers;

public interface EntityDtoMapper<E, D> {
    D toDto(E entity);
}
