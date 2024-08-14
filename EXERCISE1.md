# 1. Extract domain models from user stories

### Warm up

A **User Story** describes one thing a program is expected to do, from the perspective of somebody using that program. When planning a program, the client's requirements will be decomposed into many User Stories. Much of a developer's life is spent translating User Stories into a functional system. These systems are made up of different components, and each component is made up of units. We call these systems **Domain Models**.

There are various different formats for user stories but they all share a common goal: describe a feature the user wants. Here's one style of user story:

```
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by a cohort name.
```

As a developer, it's our job to extract the useful information into a functional system. Look for nouns and verbs; nouns usually describe entities, verbs usually describe methods.

Here is how one might design a domain model for the above user story:

| Classes         | Methods                                     | Scenario               | Outputs |
|-----------------|---------------------------------------------|------------------------|---------|
| `CohortManager` | `search(List<String> cohorts, String name)` | If name is in list     | true    |
|                 |                                             | If name is not in list | false   |

> **Time to analyse**
>
> Evaluate the user story and the domain model above. What assumptions did the developer have to make and what would you do differently?
> 
> Create your own domain model for the user story above, try to come up with a different solution than the model provided. You can use a table like the one above, a spreadsheet, pen and paper, whatever you'd like. Share your work in your cohorts classroom channel when you're done.

| Classes        | Member variables            | Methods               | Scenario     | Outcomes |
|----------------|-----------------------------|-----------------------|--------------|------|
| `CohortManager` | `ArrayList<String> cohorts` | `search(String name)` | Name in list | True |
|                |                             |                       |              |      |



### Exercise

Follow the same process as above to translate these two user stories into domain models.

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes       | Member variables | Methods | Scenario | Outcomes |
|---------------|------------------|---------|----------|----------|
| `Supermarket` |                  |         |          |          |
|               |                  |         |          |          |
|               |                  |         |          |          |


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

- Add your domain models to this repository as a file named `domain-model`. This should either be a `.md` file like this one, or a screenshot / picture of your work.
- Your model doesn't have to look like the example provided in this file. If you feel like you need more or less columns, feel free to go with that. There is no "right way" to do this kind of thing, we're just designing a system to make our lives easier when it comes to the coding part.