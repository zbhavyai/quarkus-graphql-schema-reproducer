## REST

1. GET

   ```
   $ curl -X GET http://localhost:8080/rest/allFilms
   ```

2. POST

   ```
   $ curl -X POST -H "Content-Type: application/json" -d '{"id": {"value": "4"}, "title": "Test title", "episode": "9", "director": "Test director", "releaseDate": "2022-05-07"}' http://localhost:8080/rest/
   ```

3. DELETE

   ```
   $ curl -X DELETE http://localhost:8080/rest/1
   ```

## GraphQL (GraphQL doesn't build)

1. GET

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d "query getMeAllFilms {
       allFilms {
           director
           episode
           releaseDate
           title
       }
   }" http://localhost:8080/graphql
   ```

2. POST

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d 'mutation createMyFilm {
       addFilm(f: {
           title: "Test title",
           episode: "9",
           director: "Test director",
           releaseDate: "2022-05-07"
           id: {
              value: "4"
           }
       }
   )
   }' http://localhost:8080/graphql
   ```

3. DELETE

   ```
   $ curl -g -X POST -H "Content-Type: application/graphql" -d "mutation deleteMyFilm {
       deleteFilm(id: 1)
   }" http://localhost:8080/graphql
   ```
