import streamlit as st
import requests
import pandas as pd

# Set page title and favicon
st.set_page_config(page_title="Query Result", page_icon=":memo:", layout="wide")

# Add a header
st.title("Result")

# Define API endpoint URLs
url1 = "http://localhost:8080/county-info"
url2 = "http://localhost:8080/markets"
url3 = "http://localhost:8080/operations"
url4 = "http://localhost:8080/locations"
url5 = "http://localhost:8080/welfare-programs"

# Define function to fetch data from API
def fetch_data(url):
    response = requests.get(url)
    data = response.json()
    return data

# Add a dropdown menu with 5 options
option = st.selectbox("Select a query", ("Option 1", "Option 2", "Option 3", "Option 4", "Option 5"))

# Call the appropriate API endpoint based on the selected option
if option == "Option 1":
    data = fetch_data(url1)
elif option == "Option 2":
    data = fetch_data(url2)
elif option == "Option 3":
    data = fetch_data(url3)
elif option == "Option 4":
    data = fetch_data(url4)
elif option == "Option 5":
    data = fetch_data(url5)

# Convert JSON data to a pandas DataFrame
df = pd.json_normalize(data)

# Display the DataFrame in Streamlit
st.dataframe(df)

# Add a sidebar with information about the app
st.sidebar.header("Group 50")
st.sidebar.info("CSE 4/560 Data Models and Query Language Semester Project")
