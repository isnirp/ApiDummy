# stream
- java 8
- java.util.stream
- a sequence of elements supporting sequential and parallel aggregate operations
- stream is not a data structure, does not store data
- a stream of object reference
- primitive streams
    - IntStream
    - LongStream
    - DoubleStream

## stream pipeline
- stream operations are composed of a stream pipeline
    - source(array, collection, I/O)
    - intermediate operations(0 or more) *//transform stream into another stream*
    - terminal operation *//produces a result or side-effect*
- Streams are lazy; computation is only performed when terminal operation is initiated

## create stream
- Stream.of(array[])
- Arrays.stream([])
- list.stream()
- Stream.Builder<String> someStream = Stream.builder(); someStream.accept(o)

## operations
- intermediate
- - iF: Function, iP: Predicate, iS: Supplier
- map(iF) *//produces a new stream of a different type*
- filter(iP)
- flatMap() *//flattens complex data structure to a simple one
- peek()
- terminal
    - forEach(iS)
    - collect(param) *//repackages elements to some data structure
        - param: Collectors.toList(), Collectors.toSet()
        - Collectors.joining()
        - Collectors.toCollection(new c)
    - toArray(new []) *//gets array from stream
    - findFirst() *//returns an Optional for the first entry in the stream*
- short circuiting operations (intermediate)
    - skip()
    - limit()
    - allMatch(iP), anyMatch(iP), noneMatch(iP)
- comparison based operations (intermediate)
    - sorted()
    - min(), max() *//returns optional*
    - distinct()